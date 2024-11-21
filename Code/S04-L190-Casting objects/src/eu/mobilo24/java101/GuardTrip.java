package eu.mobilo24.java101;

public class GuardTrip extends Trip{
    private String guardName;
    private Integer minAge;
    private Integer maxAge;
    public static final Integer costRatio = 2;

    public GuardTrip(){
    }

    public GuardTrip(String tripDestination, int tripDuration,
                int tripRating, int tripEstimatedCost, String tripGuardName) {
        super(tripDestination, tripDuration, tripRating, tripEstimatedCost);
        guardName = tripGuardName;
    }

    @Override
    public String getInfo(boolean withRating) {
        String s = super.getInfo(withRating);
        s += "\nGuardian name: " + guardName;
        s += "\nEstimated cost: " + getEstimatedCost();

        return s;
    }

    public String getGuardName() {
        return guardName;
    }

    public void setGuardName(String guardName) {
        this.guardName = guardName;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }
}
