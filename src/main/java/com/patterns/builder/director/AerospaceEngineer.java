package com.patterns.builder.director;

import com.patterns.builder.Airplane;
import com.patterns.builder.AirplaneBuilder;

public class AerospaceEngineer {
    AirplaneBuilder airplaneBuilder;
    public void setAirplaneBuilder(AirplaneBuilder ab) {
        airplaneBuilder = ab;
    }
    public Airplane getAirplane() {
        return airplaneBuilder.getAirplane();
    }
    public void constructAirplane() {
        airplaneBuilder.createNewAirplane();
        airplaneBuilder.buildWings();
        airplaneBuilder.buildPowerplant();
        airplaneBuilder.buildAvionics();
        airplaneBuilder.buildSeats();
    }
}
