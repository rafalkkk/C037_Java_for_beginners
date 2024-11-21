package eu.mobilo24.java102;

import java.util.ArrayList;
import java.util.Arrays;
import eu.mobilo24.java101.*;

public class Main {
    public static void main(String[] args) {

        Trip rome = new Trip("Rome", 3,
                88, 1000);
        rome.setAttractions(new ArrayList<String>(
                        Arrays.asList("Colosseum by Night","Sistine Chapel",
                        "Vatican Museums")), false);

        GuardTrip gRome = new GuardTrip();
        gRome.setDestination("Rome");

        GuardTrip gParis = new GuardTrip("Paris", 5,
                -5, 1200, "Pierre Zarpanzur");

        Object[] objArray = {rome, gRome, gParis, "Legoland"};

        for (Object obj: objArray){
            displayInfo(obj);
        }

    }

    private static void displayInfo(Object obj){
        if (obj instanceof GuardTrip gTrip){
            System.out.println("GuardTrip: " +
                    gTrip.getDestination() + "/" +
                    gTrip.getGuardName());
        }
        else if (obj instanceof Trip trip) {
            System.out.println("Trip: " +
                    trip.getDestination());
        }
        else if (obj instanceof String s) {
            System.out.println("String: " + s.toUpperCase());
        }
    }
}

