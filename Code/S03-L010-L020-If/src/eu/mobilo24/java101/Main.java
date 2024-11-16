package eu.mobilo24.java101;

public class Main {
    public static void main(String[] args) {

        byte temperature = 39;
        boolean isRaining = false;
        float cloudPercent = 0.4f;
        short windSpeed = 2;

        final short MAX_WIND_SPEED = 17;
        final short STRONG_WIND_SPEED = 10;
        final short MAX_TEMPERATURE = 32;

        if (windSpeed > MAX_WIND_SPEED || temperature > MAX_TEMPERATURE ) {
            System.out.println("Stay at home!");
        }
        else {
            System.out.println("You can go outside.");
        }

        if (isRaining && windSpeed > STRONG_WIND_SPEED) {
            System.out.println("Take a jacket instead of an umbrella - wind is too strong, but it rains.");
        }
        else if (isRaining && windSpeed <= STRONG_WIND_SPEED) {
            System.out.println("It rains - take umbrella");
        }
        else if (!isRaining && cloudPercent > 0.6f){
            System.out.println("It may rain. Take umbrella or jacket.");
        }
        else {
            System.out.println("No recommendations in aspect of rain.");
        }

        if (temperature <= 0){
            System.out.println("Dress warmly. It is freezing.");
        }
        else if (temperature < 10){
            System.out.println("It's cold");
        }
        else if (temperature < 20) {
            System.out.println("It's cool");
        }
        else if (temperature < 24) {
            System.out.println("It's warm");
        } else {
            System.out.println("It's hot");
        }

        String message = null;
//        if (temperature > 20){
//            message = "The weather is NICE.";
//        }
//        else {
//            message = "It's horrible cold.";
//        }
        message = temperature > 20 ? "The weather is NICE" : "It's horrible cold!";
        System.out.println(message);

        float temp = 36.6f;
        int roundedTemp = (int) (temp + (temp > 0 ? 0.5 : -0.5));
        System.out.println("RoundedBodyTemperature: " + roundedTemp);

//        if (windSpeed > MAX_WIND_SPEED || temperature > MAX_TEMPERATURE )
//            System.out.println("Stay at home!");
//        else
//            System.out.println("You can go outside.");
//            System.out.println("-------------------");

        String info = "";
        boolean isDangerous = windSpeed > MAX_WIND_SPEED || temperature > MAX_TEMPERATURE;
        if (isDangerous) {
            info = "STAY AT HOME!";
        }
        else {
            info = "You can go outside.";
        }
        System.out.println(info);



    }
}