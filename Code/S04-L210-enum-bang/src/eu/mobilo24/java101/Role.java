package eu.mobilo24.java101;

import java.util.Random;

public enum Role {
    // SHERIFF, DEPUTY, OUTLAW, RENEGADE;
    SHERIFF("\u2B50 \u2B50 \u2B50 \u2B50"),
    DEPUTY("\u2B50 \u2B50 \u2B50"),
    OUTLAW("\u2B50 \u2B50"),
    RENEGADE("\u2B50");

    private String symbol = "";

    private Role(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol(){
        return this.symbol;
    }

    public static Role getRandomRole() {
        Role[] roles = Role.values();
        int randomIndex = new Random().nextInt(roles.length);
        return roles[randomIndex];
    }

    public boolean plusCartridge(){
        return this == SHERIFF;
    }

    public String getResponsibility(){
        String text;
        switch(this) {
            case SHERIFF:
                text = "Protects the town from outlaws and renegade.";
                break;
            case DEPUTY:
                text = "Aid the Sheriff in eliminating outlaws and the renegade.";
                break;
            case OUTLAW:
                text = "Aim to kill the Sheriff and reign chaos.";
                break;
            default:
                text = "Seeks to be the last one standing, eliminating everyone else.";
        }
        return text;
    }
}
