package eu.mobilo24.java101;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Trip rome = new Trip("Rome", 3,
                8, 1000);
        rome.setAttractions(new ArrayList<String>(
                        Arrays.asList("Colosseum by Night","Sistine Chapel",
                        "Vatican Museums")), false);

        Trip berlin = new Trip("Berlin", 2,
                7, 900);
        berlin.setAttractions(new ArrayList<String>(
                Arrays.asList("Berlin Wall","Reichstag")), false);

        Trip paris = new Trip();
        paris.setDestination("Paris");

//        ArrayList<Trip> offer = new ArrayList<Trip>();
//        offer.add(paris);
//        offer.add(rome);
//        offer.add(berlin);
//
//        System.out.println(offer);
        System.out.println("Total estimated cost: "+Trip.getTotalEstimatedCost());
        rome.setEstimatedCost(1200);
        System.out.println("Total estimated cost: "+Trip.getTotalEstimatedCost());

        rome = null;
        System.gc();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Total estimated cost: "+Trip.getTotalEstimatedCost());

    }
}

