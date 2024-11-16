package eu.mobilo24.java101;

public class Types {
    public static void main(String[] args) {

        boolean isExpired = true;
        System.out.println("isExpired: "+isExpired);

        char type = 'A';
        System.out.println("type: "+type);

        char currency = '€';
        System.out.println("currency: "+currency);
        char weather = '\u2744';
        System.out.println("weather: "+weather);

//        char name = 'abc';
//        System.out.println("name: "+name);

        byte age = 127;
        System.out.println("age: "+age);

        short stockAmount = 32767;
        System.out.println("stockAmount: "+stockAmount);

        int transactionId = 2147483647;
        System.out.println("transactionId: "+transactionId);

        long durationMilliseconds = Long.MAX_VALUE;
        System.out.println("durationMilliseconds: "+durationMilliseconds);

        float temperature = 36.6f;
        System.out.println("temperature: "+temperature);

        double starDistance = Double.MAX_VALUE;
        System.out.println("starDistance: "+starDistance);
    }
}