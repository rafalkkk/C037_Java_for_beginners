package eu.mobilo24.java101;

public class Trip{

    private String destination = "";
    private Integer duration = null;
    private Integer rating = 0;

    public Trip() {
        destination = "Unknown";
        duration = null;
        rating = null;
    }

    public Trip(String tripDestination, int tripDuration,
                int tripRating ) {
        destination = tripDestination;
        duration = Math.max(tripDuration, 1);
        rating = Math.max(Math.min(tripRating,10),1);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = Math.max(duration, 1);
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = Math.max(Math.min(rating, 10), 1);
    }

}