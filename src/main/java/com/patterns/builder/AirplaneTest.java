package com.patterns.builder;

import com.patterns.builder.*;
import com.patterns.builder.concreteBuilder.CropDuster;
import com.patterns.builder.concreteBuilder.FighterJet;
import com.patterns.builder.concreteBuilder.Glider;
import com.patterns.builder.director.AerospaceEngineer;

public class AirplaneTest {
    public static void main(String[] args) {
        // instantiate the director (hire the engineer)
        AerospaceEngineer aero = new AerospaceEngineer();
        // instantiate each concrete builder (take orders)
        AirplaneBuilder crop = new CropDuster("Farmer Joe");
        AirplaneBuilder fighter = new FighterJet("The Navy");
        AirplaneBuilder glider = new Glider("Tim Rice");
        // build a CropDuster
        aero.setAirplaneBuilder(crop);
        aero.constructAirplane();
        Airplane completedCropDuster = aero.getAirplane();
        System.out.println(completedCropDuster.getType() +
                " is completed and ready for delivery to " +
                completedCropDuster.getCustomer());

        aero.setAirplaneBuilder(fighter);
        aero.constructAirplane();
        Airplane completedFightJet = aero.getAirplane();
        System.out.println(completedFightJet.getType() +
                " is completed and ready for delivery to " +
                completedFightJet.getCustomer());

        aero.setAirplaneBuilder(glider);
        aero.constructAirplane();
        Airplane completedGlider = aero.getAirplane();
        System.out.println(completedGlider.getType() +
                " is completed and ready for delivery to " +
                completedGlider.getCustomer());
    }
}
