package eu.mobilo24.java101;

public class Trip{
    public String destination = "";
    public int duration = 0;
    public int rating = 0;

    public Trip() {
        destination = "";
        duration = 0;
        rating =0;
    }

    public Trip(String tripDestination, int tripDuration,
                int tripRating ) {
        destination = tripDestination;
        duration = Math.max(tripDuration, 1);
        rating = Math.max(Math.min(tripRating,10),1);
    }
}