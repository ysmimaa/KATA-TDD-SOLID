package com.kata.tdd.solid.repo;

import com.kata.tdd.solid.repo.impl.DriverRepoDAOMySqlImpl;
import com.kata.tdd.solid.repo.impl.DriverRepoDaoOracleImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DriverRepoDAOTest {

    private DriverRepoDAO driverRepoDAO;

    @BeforeEach
    void init() {

    }

    @Test
    void should_establish_mysql_connection_() {
        driverRepoDAO = new DriverRepoDAOMySqlImpl();
        String mySqlConnection = driverRepoDAO.connect();
        Assertions.assertEquals("MySql connection", mySqlConnection);
    }

    @Test
    void should_establish_oracle_connection_() {
        driverRepoDAO = new DriverRepoDaoOracleImpl();
        String oracleConnection = driverRepoDAO.connect();
        Assertions.assertEquals("Oracle connection", oracleConnection);
    }

    @Test
    void should_disconnect_from_mysql() {
        driverRepoDAO = new DriverRepoDAOMySqlImpl();
        String mySqlDisconnection = driverRepoDAO.disconnect();
        Assertions.assertEquals("MySql disconnection", mySqlDisconnection);
    }

    @Test
    void should_disconnect_from_oracle() {
        driverRepoDAO = new DriverRepoDAOMySqlImpl();
        String oracleDisconnection = driverRepoDAO.disconnect();
        Assertions.assertEquals("Oracle disconnection", oracleDisconnection);
    }
}