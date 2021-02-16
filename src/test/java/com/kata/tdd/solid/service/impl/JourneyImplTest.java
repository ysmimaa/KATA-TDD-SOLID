package com.kata.tdd.solid.service.impl;

import com.kata.tdd.solid.business.Journey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("**** JourneyImplSpec")
public class JourneyImplTest {

    @Test
    void should_return_create_journey() {
        JourneyServiceImpl journeyService = new JourneyServiceImpl();
        Journey journey = new Journey();
        journey.setDesc("desc");
        Journey createdJourney = journeyService.createJourney(journey);
        Assertions.assertEquals("desc", createdJourney.getDesc());
    }

    @Test
    void should_throw_exception_when_journey_provided_is_invalid() {
        JourneyServiceImpl journeyService = new JourneyServiceImpl();
        Assertions.assertThrows(NullPointerException.class, () -> journeyService.createJourney(null), "Journey must be valid");
    }

    @Test
    @DisplayName("Should update journey")
    void should_update_journey_when_it_is_valid() {
        JourneyServiceImpl journeyService = new JourneyServiceImpl();

        Journey journeyToCreate = new Journey();
        journeyToCreate.setIdJourney("1");
        journeyToCreate.setDesc("desc");
        journeyService.createJourney(journeyToCreate);

        Journey journeyToBeUpdated = new Journey();

        journeyToBeUpdated.setIdJourney("1");
        journeyToBeUpdated.setDesc("desc1");
        Journey journey = journeyService.updateJourney(journeyToBeUpdated);

        Assertions.assertEquals("desc1", journey.getDesc());
    }

    @Test
    @DisplayName("Should update journey")
    void should_return_a_journey_by_description_when_it_is_valid() {
        JourneyServiceImpl journeyService = new JourneyServiceImpl();

        Journey journeyToCreate = new Journey();
        journeyToCreate.setIdJourney("1");
        journeyToCreate.setDesc("desc");
        journeyService.createJourney(journeyToCreate);

        List<Journey> foundJourneys = journeyService.getJourneyByDesc("desc");

        Assertions.assertEquals("desc", foundJourneys.get(0).getDesc());
    }

    @Test
    void should_return_all_journeys() {
        JourneyServiceImpl journeyService = new JourneyServiceImpl();
        Journey journeyToCreate = new Journey();
        journeyToCreate.setIdJourney("1");
        journeyToCreate.setDesc("desc");
        journeyService.createJourney(journeyToCreate);

        List<Journey> foundJourneys = journeyService.fetchAllJourneys();

        Assertions.assertEquals(1, foundJourneys.size());

    }

    @Test
    void should_return_a_journey_by_id_when_it_is_valid() {
        JourneyServiceImpl journeyService = new JourneyServiceImpl();

        Journey journeyToCreate = new Journey();
        journeyToCreate.setIdJourney("1");
        journeyToCreate.setDesc("desc");
        journeyService.createJourney(journeyToCreate);

        Journey journeyById = journeyService.findById(0);

        Assertions.assertEquals("desc", journeyById.getDesc());
    }
}
