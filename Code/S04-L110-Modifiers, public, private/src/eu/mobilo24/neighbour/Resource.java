package eu.mobilo24.neighbour;

public class Resource {
    private String name;
    private Boolean onlyMine;

    public Resource(String name, Boolean onlyMine){
        this.name = name;
        this.onlyMine = onlyMine;
    }

    public String getName() {
        return name;
    }

    public void canYouLendMe(){
        if (onlyMine){
            System.out.println("Sorry, no, " + name +
                    " is only mine.");
        } else {
            System.out.println("Yes, sure!");
        }
    }
}
