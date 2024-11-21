package eu.mobilo24.java101;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

public class TripUtils {

    private static final String configFileName = "trip-app.properties";
    private static final Integer defaultMinRatio = 0;
    private static final Integer defaultMaxRatio = 5;
    private static Properties properties;
    private static Integer minRatio;
    private static Integer maxRatio;

    static {
        Properties properties = new Properties();
        File file = new File(configFileName);

        if (file.exists()) {
            try (FileInputStream input = new FileInputStream(file)) {
                properties.load(input);
                String minRatioStr = properties.getProperty("trip.min-ratio", String.valueOf(defaultMinRatio));
                minRatio = Integer.parseInt(minRatioStr);
                String maxRatioStr = properties.getProperty("trip.max-ratio", String.valueOf(defaultMaxRatio));
                maxRatio = Integer.parseInt(maxRatioStr);
            } catch (IOException e) {
                // e.printStackTrace();
                System.out.println("Error reading file: " + configFileName);
                minRatio = defaultMinRatio;
                maxRatio = defaultMaxRatio;
            }
        } else {
            properties.setProperty("trip.min-ratio", String.valueOf(defaultMinRatio));
            properties.setProperty("trip.max-ratio", String.valueOf(defaultMaxRatio));
            try (FileOutputStream output = new FileOutputStream(file)) {
                properties.store(output, "Trip Configuration");
                minRatio = defaultMinRatio;
                maxRatio = defaultMaxRatio;
            } catch (IOException e) {
                // e.printStackTrace();
                minRatio = defaultMinRatio;
                maxRatio = defaultMaxRatio;
            }
        }
    }

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

    public static Integer getMinRatio(){
        return minRatio;
    }

    public static Integer getMaxRatio(){
        return maxRatio;
    }
}
