package com.kata.tdd.solid.service.impl;

import com.kata.tdd.solid.business.Driver;
import com.kata.tdd.solid.service.GenericFind;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class FindDriverByFirstNameTest {

    private GenericFind findDriverByDesc;

    @BeforeEach
    void init() {
        findDriverByDesc = new FindDriverByFirstName();
    }

    @Test
    void should_return_driver_by_description() {
        List<Driver> driver = Arrays.asList(new Driver(1L, "driver1", "", ""));
        List<String> foundDrivers = driver.stream()
                .map(Driver::getFirstname)
                .filter(findDriverByDesc::find)
                .collect(Collectors.toList());

        Assertions.assertEquals(1, foundDrivers.size());
    }
}