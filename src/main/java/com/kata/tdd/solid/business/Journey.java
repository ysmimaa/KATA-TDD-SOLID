package com.kata.tdd.solid.business;

import java.util.Date;

public class Journey {
    private String idJourney;
    private String desc;
    private int nbrOfPlace;
    private Date startTime;
    private Date endTime;


    public String getIdJourney() {
        return idJourney;
    }

    public void setIdJourney(String idJourney) {
        this.idJourney = idJourney;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getNbrOfPlace() {
        return nbrOfPlace;
    }

    public void setNbrOfPlace(int nbrOfPlace) {
        this.nbrOfPlace = nbrOfPlace;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
