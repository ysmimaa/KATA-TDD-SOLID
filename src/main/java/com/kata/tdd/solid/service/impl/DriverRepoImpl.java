package com.kata.tdd.solid.service.impl;


import com.kata.tdd.solid.business.Driver;
import com.kata.tdd.solid.repo.DriverRepoDAO;
import com.kata.tdd.solid.repo.impl.DriverRepoDaoOracleImpl;

import java.util.ArrayList;
import java.util.List;

public class DriverRepoImpl {

    private DriverRepoDAO driverRepoDAO = new DriverRepoDaoOracleImpl();

    private ArrayList<Driver> listDrivers = new ArrayList<>();

    public void createDriver(Driver arg1) {
        driverRepoDAO.connect();
        listDrivers.add(arg1);
        driverRepoDAO.disconnect();
    }

    public Driver findDriverById(int id) {
        driverRepoDAO.connect();
        Driver driver = listDrivers.get(id);
        driverRepoDAO.disconnect();
        return driver;

    }

    public void updateDriver(Driver arg1) {
        driverRepoDAO.connect();
        for (int i = 0; i < listDrivers.size(); i++)
            if (listDrivers.get(i).getId() == arg1.getId()) {
                listDrivers.remove(i);
                listDrivers.add(i, arg1);
            }
        driverRepoDAO.disconnect();

    }

    public List<Driver> getDriverFirstName(String firstName) {
        List<Driver> output = new ArrayList<>();
        driverRepoDAO.connect();
        for (Driver listDriver : listDrivers)
            if (listDriver.getAddress().equals(firstName))
                output.add(listDriver);
        driverRepoDAO.disconnect();

        return output;
    }

    public Driver deleteDriverById(int id) {
        driverRepoDAO.connect();
        Driver remove = listDrivers.remove(id);
        driverRepoDAO.disconnect();
        return remove;
    }

    public ArrayList<Driver> fetchDrivers() {
        driverRepoDAO.disconnect();
        ArrayList<Driver> listDrivers = this.listDrivers;
        driverRepoDAO.connect();
        return listDrivers;
    }

}
