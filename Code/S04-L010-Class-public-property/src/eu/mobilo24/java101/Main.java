package eu.mobilo24.java101;

public class Main {
    public static void main(String[] args) {

        Trip rome = new Trip();
        rome.destination = "Rome";
        rome.duration = 3;
        rome.rating = 8;

        Trip paris = new Trip();
        paris.destination = "Paris";
        paris.duration = 5;
        paris.rating = 7;

        System.out.println("Trip to " + rome.destination +
                " lasts " + rome.duration +
                " days and has rating of " + rome.rating);

        System.out.println("Trip to " + paris.destination +
                " lasts " + paris.duration +
                " days and has rating of " + paris.rating);

        paris.rating += 5;
        System.out.println("Trip to " + paris.destination +
                " lasts " + paris.duration +
                " days and has rating of " + paris.rating);


    }
}