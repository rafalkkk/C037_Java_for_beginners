package eu.mobilo24.java101;

public class Main {
    public static void main(String[] args) {

//        Trip rome = new Trip();
//        rome.setDestination("Rome");
//        rome.setDuration(3);
//        rome.setRating(8);
//
//        Trip paris = new Trip();
//        paris.setDestination("Paris");
//        paris.setDuration(5);
//        paris.setRating(7);

        Trip rome = new Trip("Rome", 3,
                8);
        Trip paris = new Trip("Paris", 5,
                7);

        System.out.println("Trip to " + rome.getDestination() +
                " lasts " + rome.getDuration() +
                " days and has rating of " + rome.getRating());

        System.out.println("Trip to " + paris.getDestination() +
                " lasts " + paris.getDuration() +
                " days and has rating of " + paris.getRating());

        paris.setRating(paris.getRating() + 5);
        System.out.println("Trip to " + paris.getDestination() +
                " lasts " + paris.getDuration() +
                " days and has rating of " + paris.getRating());

        Trip madrid = new Trip("Madrid",
                4, -19);
        System.out.println("Trip to " + madrid.getDestination() +
                " lasts " + madrid.getDuration() +
                " days and has rating of " + madrid.getRating());

    }
}