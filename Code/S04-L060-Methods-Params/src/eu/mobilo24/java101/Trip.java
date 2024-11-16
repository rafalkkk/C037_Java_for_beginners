package eu.mobilo24.java101;

import java.util.ArrayList;

public class Trip{

    private String destination = null;
    private Integer duration = null;
    private Integer rating = null;
    private  ArrayList<String> attractions = new ArrayList<String>();

    public Trip() {
    }

    public Trip(String tripDestination, int tripDuration,
                int tripRating ) {
        destination = tripDestination;
        duration = Math.max(tripDuration, 1);
        rating = Math.max(Math.min(tripRating,10),1);
    }

    public Trip(Trip trip){
        this.destination = trip.destination;
        this.duration = trip.duration;
        this.rating = null;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = Math.max(duration, 1);
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = Math.max(Math.min(rating, 10), 1);
    }

    public String getInfo(boolean withRating) {
        String s = "Trip to " + this.getDestination() +
                " lasts " + this.getDuration() + " days";
        if(withRating)
            s += " and has rating of " + this.getRating();
        s += "\nAttractions: " + this.getAttractions();

        return s;
    }

    public String getInfo(){
        return this.getInfo(false);
    }

    public ArrayList<String> getAttractions() {
        return attractions;
    }

    public void setAttractions(ArrayList<String> attractions,
                               boolean convertByNight) {
        for(String a : attractions) {
            if (convertByNight && a.contains("by Night")) {
                a = a.toUpperCase();
            }
            this.attractions.add(a);
        }
    }

    
}