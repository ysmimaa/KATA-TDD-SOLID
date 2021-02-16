package com.kata.tdd.solid.service.impl;

import com.kata.tdd.solid.business.Journey;
import com.kata.tdd.solid.service.GenericFind;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JourneyServiceImpl {

    //Data Access Object "DAO" in the future...
    private List<Journey> journeys = new ArrayList<>();

    public Journey createJourney(Journey journey) {
        if (journey == null) {
            throw new NullPointerException("Journey must be valid");
        }
        journeys.add(journey);
        return journey;
    }

    public Journey updateJourney(Journey journey) {
        for (int i = 0; i < journeys.size(); i++)
            if (journeys.get(i).getIdJourney().equals(journey.getIdJourney())) {
                journeys.add(i, journey);
                journeys.remove(i);
            }
        return journey;
    }

    public List<Journey> getJourneyByDesc(String firstName) {
        List<Journey> output = new ArrayList<>();
        for (Journey journey : journeys)
            if (journey.getDesc().equals(firstName)) {
                output.add(journey);
            }
        return output;
    }

    public List<Journey> fetchAllJourneys() {
        return this.journeys;
    }

    //Example
    public List<Journey> JourneyByGenericFind() {
        GenericFind stringGenericFind = new FindDriverByFirstName();
        return journeys.stream()
                .filter(journey -> stringGenericFind.find(journey.getDesc()))
                .collect(Collectors.toList());


    }

    public Journey findById(int id) {
        return journeys.get(id);
    }

}
