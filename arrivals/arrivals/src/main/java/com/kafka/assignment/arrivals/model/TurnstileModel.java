package com.kafka.assignment.arrivals.model;

public class TurnstileModel {
    String station_id;
    String station_name;
    String line;


    public TurnstileModel(String station_id, String station_name, String line) {
        this.station_id = station_id;
        this.station_name = station_name;
        this.line = line;
    }

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }
}
