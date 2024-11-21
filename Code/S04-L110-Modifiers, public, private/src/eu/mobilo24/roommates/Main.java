package eu.mobilo24.roommates;

import eu.mobilo24.neighbour.*;

public class Main {
    public static void main(String[] args) {

        Resource thing = new Resource(
                "Ketchup", false);

        System.out.println("Oh I see you have " + thing.getName() +
                ". Could you lend me it?");
        thing.canYouLendMe();
    }
}