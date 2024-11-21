package eu.mobilo24.java102;

import java.util.ArrayList;
import java.util.Arrays;
import eu.mobilo24.java101.*;

public class Main {
    public static void main(String[] args) {

        Trip rome = new Trip("Rome", 3,
                8, 1000);
        rome.setAttractions(new ArrayList<String>(
                        Arrays.asList("Colosseum by Night","Sistine Chapel",
                        "Vatican Museums")), false);

        GuardTrip gRome = new GuardTrip();
        System.out.println("GuardTrip: Rome: duration: " + gRome.getDuration());

        GuardTrip gParis = new GuardTrip("Paris", 5,
                5, 1200, "Pierre Zarpanzur");
        System.out.println("GuardTrip: destination: " + gParis.getDestination());
    }
}

