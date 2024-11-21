package eu.mobilo24.java101;

public class Main {
    public static void main(String[] args) {
        Role myRole = Role.getRandomRole();
        System.out.println("My role is: " + myRole + " " + myRole.getSymbol());

        if (myRole == Role.SHERIFF || myRole == Role.DEPUTY){
            System.out.println("You are a good character!");
        } else {
            System.out.println("Oh no! You are a bad character!");
        }

        if (myRole.plusCartridge()) {
            System.out.println("Take one more cartridge.");
        }

        System.out.println("Your responsibility is: " + myRole.getResponsibility());


        if (myRole.compareTo(Role.OUTLAW) < 0){
            System.out.println("You are better than outlaw");
        } else if (myRole.compareTo(Role.OUTLAW) > 0) {
            System.out.println("You are worse then outlaw");
        }

    }
}


