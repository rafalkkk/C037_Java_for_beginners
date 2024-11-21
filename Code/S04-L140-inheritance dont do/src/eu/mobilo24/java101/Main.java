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

        GuardTrip gRome = new GuardTrip();
        gRome.setDestination("Rome");
        gRome.setDuration(4);
        gRome.setGuardName("Adam Robinson");
        System.out.println(gRome.getInfo());


        //System.out.println(gRome.getGuardName());



    }
}

