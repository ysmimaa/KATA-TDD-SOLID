package com.kata.tdd.solid.service.impl;

import com.kata.tdd.solid.service.DriverGenericMetrics;

public class DriverMetricCsv implements DriverGenericMetrics {
    @Override
    public String printMetrics() {
        System.out.println("Csv Report");
        return "Csv";
    }
}
