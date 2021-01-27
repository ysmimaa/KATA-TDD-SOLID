package com.kata.tdd.solid.service.impl;

import com.kata.tdd.solid.service.DriverGenericMetrics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("***** DriverMetricsSpec *****")
class DriverMetricTest {

    private DriverGenericMetrics driverGenericMetrics;

    @Test
    void should_return_driver_metrics_in_xml_format() {
        driverGenericMetrics = new DriverMetricXml();
        String reportFile = driverGenericMetrics.printMetrics();
        Assertions.assertEquals("Xml", reportFile);
    }

    @Test
    void should_return_driver_metrics_in_csv_format() {
        driverGenericMetrics = new DriverMetricCsv();
        String reportFile = driverGenericMetrics.printMetrics();
        Assertions.assertEquals("Csv", reportFile);
    }

}