package com.kata.tdd.solid.repo.impl;

import com.kata.tdd.solid.repo.DriverRepoDAO;

public class DriverRepoDAOMySqlImpl implements DriverRepoDAO {
    @Override
    public String connect() {
        System.out.println("Connecting with mySql provider");
        return "MySql connection";
    }

    @Override
    public String disconnect() {
        System.out.println("Connecting with mySql provider");
        return "MySql disconnection";
    }
}
