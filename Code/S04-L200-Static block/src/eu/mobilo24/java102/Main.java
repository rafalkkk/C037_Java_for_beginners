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
        gRome.setRating(4);

        GuardTrip gParis = new GuardTrip("Paris", 5,
                -5, 1200, "Pierre Zarpanzur");

        System.out.println("Rome (88): " + rome.getRating());
        System.out.println("Guard Rome (4): " + gRome.getRating());
        System.out.println("Guard Paris (-5): " + gParis.getRating());

    }
}

