package eu.mobilo24.java101;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TripUtils {

    static void saveFile(String path, ArrayList<Trip> tripList){

        try {
            FileWriter fw = new FileWriter(path);
            PrintWriter pw = new PrintWriter(fw);

            for (Trip trip : tripList) {
                System.out.println(trip);
                pw.println(trip.getDestination()+"|"+
                        trip.getDuration()+"|"+
                        trip.getRating());
                StringBuilder sb = new StringBuilder();
                for(String attraction : trip.getAttractions()) {
                    sb.append(attraction).append("|");
                }
                pw.println(sb);
            }

            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static ArrayList<Trip> readFile(String path) {
        ArrayList<Trip> tripList = new ArrayList<Trip>();

        try {
            FileReader fr =  new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split("\\|");

                Trip trip = new Trip();
                trip.setDestination(array[0]);
                if(!array[1].equals("null"))
                    trip.setDuration(Integer.parseInt(array[1]));
                if(!array[2].equals("null"))
                    trip.setRating(Integer.parseInt(array[2]));

                line = br.readLine();
                array = line.split("\\|");
                ArrayList<String> attractionsList =
                        new ArrayList<String>(Arrays.asList(array));
                trip.setAttractions(attractionsList, false);

                tripList.add(trip);
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tripList;
    }
}
