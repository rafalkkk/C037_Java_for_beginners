package eu.mobilo24.java101;

import java.util.ArrayList;

public class Trip{

    private String destination = null;
    private Integer duration = null;
    private Integer rating = null;


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

    public String displayInfo(boolean withRating) {
        String s = "Trip to " + this.getDestination() +
                " lasts " + this.getDuration() + " days";
        if(withRating)
            s += " and has rating of " + this.getRating();

        return s;
    }

    public String displayInfo(){
        return this.displayInfo(false);
    }

}