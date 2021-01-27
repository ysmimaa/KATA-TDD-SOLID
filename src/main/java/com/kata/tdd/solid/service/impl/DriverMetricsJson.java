package com.kata.tdd.solid.service.impl;

import com.kata.tdd.solid.service.DriverGenericMetrics;

public class DriverMetricsJson implements DriverGenericMetrics {
    @Override
    public String printMetrics() {
        return "Json report";
    }
}
