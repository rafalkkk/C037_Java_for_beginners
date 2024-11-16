package eu.mobilo24.java101;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Trip rome = new Trip();
        System.out.println(rome.getInfo());
        System.out.println(rome.getInfo(true));

        rome.setDestination("Rome");
        rome.setDuration(3);
        rome.setRating(8);

        System.out.println("Trip to " + rome.getDestination() +
                " lasts " + rome.getDuration() +
                " days and has rating of " + rome.getRating());

        Trip romeNight = new Trip(rome);
        System.out.println("Trip to " + romeNight.getDestination() +
                " lasts " + romeNight.getDuration() +
                " days and has rating of " + romeNight.getRating());

        ArrayList<String> attractions = new ArrayList<String>(
                Arrays.asList("Colosseum by Night","Sistine Chapel",
                        "Vatican Museums"));

        romeNight.setAttractions(attractions, true);
        rome.setAttractions(attractions,false);

        System.out.println(rome.getInfo());
        System.out.println(romeNight.getInfo());

        System.out.println("Are the trips equal? " + rome.equals(romeNight));
        System.out.println(rome);
        System.out.println(romeNight);
    }
}

