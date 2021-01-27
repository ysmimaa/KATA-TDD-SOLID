package com.kata.tdd.solid.service.impl;

import com.kata.tdd.solid.service.DriverGenericMetrics;

public class DriverMetricXml implements DriverGenericMetrics {
    @Override
    public String printMetrics() {
        System.out.println("Xml metrics");
        return "Xml";
    }
}
