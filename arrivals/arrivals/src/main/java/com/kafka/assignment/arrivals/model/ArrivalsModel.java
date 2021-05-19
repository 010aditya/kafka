package com.kafka.assignment.arrivals.model;

public class ArrivalsModel {
    String stationId;
    String trainId;
    String direction;
    String line;
    String train_status;
    String prev_station;
    String prev_direction;

    public ArrivalsModel(String stationId, String trainId, String direction, String line, String train_status, String prev_station, String prev_direction) {
        this.stationId = stationId;
        this.trainId = trainId;
        this.direction = direction;
        this.line = line;
        this.train_status = train_status;
        this.prev_station = prev_station;
        this.prev_direction = prev_direction;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getTrain_status() {
        return train_status;
    }

    public void setTrain_status(String train_status) {
        this.train_status = train_status;
    }

    public String getPrev_station() {
        return prev_station;
    }

    public void setPrev_station(String prev_station) {
        this.prev_station = prev_station;
    }

    public String getPrev_direction() {
        return prev_direction;
    }

    public void setPrev_direction(String prev_direction) {
        this.prev_direction = prev_direction;
    }
}
