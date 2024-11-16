package eu.mobilo24.java101;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> fisherWishes = new ArrayList<String>();
        System.out.println("Empty - Fisher Wishes: " + fisherWishes  + " - size: " + fisherWishes.size());

        fisherWishes.add("House");
        fisherWishes.add("Kingdom");
        System.out.println("Fisher Wishes: " + fisherWishes  + " - size: " + fisherWishes.size());

        fisherWishes.add(1, "Palace");
        System.out.println("Add in position - Fisher Wishes: " + fisherWishes  + " - size: " + fisherWishes.size());

        fisherWishes.set(0, "Town");
        fisherWishes.set(1, "Kingdom");
        fisherWishes.set(2, "Moon");
        System.out.println("Set - Fisher Wishes: " + fisherWishes  + " - size: " + fisherWishes.size());

        fisherWishes.remove(2);
        System.out.println("Remove by index - Fisher Wishes: " + fisherWishes  + " - size: " + fisherWishes.size());

        fisherWishes.remove("Town");
        System.out.println("Remove by name - Fisher Wishes: " + fisherWishes  + " - size: " + fisherWishes.size());

        fisherWishes.clear();
        System.out.println("Clear - Fisher Wishes: " + fisherWishes  + " - size: " + fisherWishes.size());

        ArrayList<String> compConfig = new ArrayList<String>(3);
        System.out.println("Comp Config: " + compConfig  + " - size: " + compConfig.size());
        compConfig.add("CPU (i#)");
        compConfig.add("RAM (GB)");
        compConfig.add("DiskSize (TB)");

        ArrayList<Integer> compConfigPlayer = new ArrayList<Integer>(compConfig.size());
        compConfigPlayer.add(9);
        compConfigPlayer.add(128);
        compConfigPlayer.add(5);

        ArrayList<Integer> compConfigOffice = new ArrayList<Integer>(compConfig.size());
        compConfigOffice.add(5);
        compConfigOffice.add(16);
        compConfigOffice.add(1);

        String paramName = "RAM (GB)";
        int ramPosition = compConfig.indexOf(paramName);
        System.out.println("RAM position:" + ramPosition);
        System.out.println("RAM for player: " + compConfigPlayer.get(ramPosition));
        System.out.println("RAM for office: " + compConfigOffice.get(ramPosition));

        ArrayList<Integer> lotto = new ArrayList<Integer>( Arrays.asList(16, 33, 3, 9, 7, 24) );
        System.out.println("Lotto - original:" + lotto);

        Collections.sort(lotto);
        System.out.println("Lotto - sorted:" + lotto);

        //lotto.remove(3);
        lotto.remove((Integer)3);
        System.out.println("Lotto - removed:" + lotto);
    }
}