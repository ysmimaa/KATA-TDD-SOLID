package com.kata.tdd.solid.repo.impl;

import com.kata.tdd.solid.repo.DriverRepoDAO;

public class DriverRepoDaoOracleImpl implements DriverRepoDAO {

    @Override
    public String connect() {
        System.out.println("Connecting with Oracle provider");

        return "Oracle connection";
    }

    @Override
    public String disconnect() {
        System.out.println("Connecting with Oracle provider");
        return "Oracle disconnection";
    }
}
