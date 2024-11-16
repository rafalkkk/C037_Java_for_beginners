package eu.mobilo24.java101;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Trip rome = new Trip("Rome", 3, 8);
        rome.setAttractions(new ArrayList<String>(
                        Arrays.asList("Colosseum by Night","Sistine Chapel",
                        "Vatican Museums")), false);

        Trip berlin = new Trip("Berlin", 2, 7);
        berlin.setAttractions(new ArrayList<String>(
                Arrays.asList("Berlin Wall","Reichstag")), false);

        Trip paris = new Trip();
        paris.setDestination("Paris");

        ArrayList<Trip> offer = new ArrayList<Trip>();
        offer.add(paris);
        offer.add(rome);
        offer.add(berlin);

        System.out.println(offer);

        String filePath = "c:\\temp\\offer.txt";
        TripUtils.saveFile(filePath, offer);
        ArrayList<Trip> offer2 = TripUtils.readFile(filePath);
        System.out.println(offer2);

    }
}

