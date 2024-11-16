import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int intArrayC[] = {1, 2, 3};
        int[] intArrayJ = {11,12,13};

        System.out.println("intArrayC " + intArrayC[0]);
        System.out.println("intArrayJ " + intArrayJ[0]);

        intArrayJ = new int[5];
        intArrayJ[0] = 100;
        intArrayJ[1] = 200;
        intArrayJ[2] = 300;
        intArrayJ[3] = 400;
        intArrayJ[4] = 500;
        System.out.println("intArrayJ " + intArrayJ[4]);

        int min = 10;
        int max = 20;
        int randomNum = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println("Random " + randomNum);
        String[] stringArray = new String[randomNum];
        System.out.println("Length " + stringArray.length);
        stringArray[stringArray.length - 1] = String.valueOf(randomNum * 100);
        System.out.println("stringArray " + stringArray[stringArray.length - 1]);

        String[] productArray = {"Kugelshreiber", "Notizbuch", "Tagesordnung"};
        Boolean[] availabilityArray = {true, false, true};
        System.out.println("Availability " + productArray[0] + " - " + availabilityArray[0]);
        System.out.println("Availability " + productArray[1] + " - " + availabilityArray[1]);
        System.out.println("Availability " + productArray[2] + " - " + availabilityArray[2]);

        System.out.println("Products " + productArray);
        System.out.println("Products " + Arrays.toString(productArray));

        Object[] mixedArray = new Object[3];
        mixedArray[0] = "Hello"; // String
        mixedArray[1] = 42;      // Integer
        mixedArray[2] = 3.14;    // Double
        System.out.println("Mix " + Arrays.toString(mixedArray));

        String[] wishes = new String[3];
        wishes [0] = "house";
        wishes [1] = "palace";
        wishes [2] = "kingdom";
        System.out.println("wishes - unsorted " + Arrays.toString(wishes));
        Arrays.sort(wishes);
        System.out.println("wishes - sorted  " + Arrays.toString(wishes));

        String[] wishesHarry = new String[3];
        wishesHarry[0] = "kingdom";
        wishesHarry[1] = "palace";
        wishesHarry[2] = "house";
        System.out.println("Equals? " + Arrays.equals(wishes, wishesHarry));
        Arrays.sort(wishesHarry);
        System.out.println("Equals? " + Arrays.equals(wishes, wishesHarry));

        System.out.println("palace was a wish number... " + Arrays.binarySearch(wishes, "palace"));

        // fill, copyOf
    }
}