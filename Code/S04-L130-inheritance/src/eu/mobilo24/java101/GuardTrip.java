package eu.mobilo24.java101;

public class GuardTrip extends Trip{
    private String guardName;
    private Integer minAge;
    private Integer maxAge;

    @Override
    public String getInfo(boolean withRating) {
        String s = "Trip to " + this.getDestination() +
                " lasts " + this.getDuration() + " days";
        if (withRating)
            s += " and has rating of " + this.getRating();
        s += "\nGuardian name: " + guardName;
        s += "\nAttractions: " + this.getAttractions();

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
