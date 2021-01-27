package com.kata.tdd.solid.service.impl;


import com.kata.tdd.solid.business.Driver;
import com.kata.tdd.solid.repo.DriverRepoDAO;
import com.kata.tdd.solid.repo.impl.DriverRepoDaoOracleImpl;

import java.util.ArrayList;
import java.util.List;

public class DriverServiceImpl {

    private DriverRepoDAO driverRepoDAO = new DriverRepoDaoOracleImpl();

    private List<Driver> listDrivers = new ArrayList<>();

    public void createDriver(Driver driver) {
        listDrivers.add(driver);
    }

    public Driver findDriverById(int id) {
        Driver driver = listDrivers.get(id);
        return driver;

    }

    public void updateDriver(Driver arg1) {
        for (int i = 0; i < listDrivers.size(); i++)
            if (listDrivers.get(i).getId() == arg1.getId()) {
                listDrivers.remove(i);
                listDrivers.add(i, arg1);
            }
    }

    public List<Driver> getDriverFirstName(String firstName) {
        List<Driver> output = new ArrayList<>();
        for (Driver listDriver : listDrivers)
            if (listDriver.getAddress().equals(firstName))
                output.add(listDriver);

        return output;
    }

    public Driver deleteDriverById(int id) {
        Driver remove = listDrivers.remove(id);
        return remove;
    }

    public List<Driver> fetchDrivers() {
        driverRepoDAO.disconnect();
        List<Driver> listDrivers = this.listDrivers;
        driverRepoDAO.connect();
        return listDrivers;
    }

}
