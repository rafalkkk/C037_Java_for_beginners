public class Main {
    public static void main(String[] args) {

        byte byte1 = 100;
        short short1 = byte1;
        int int1 = short1;
        long long1 = int1;
        float float1 = long1;
        double double1 = float1;

        System.out.println("double1 = " + double1);

        double1 = double1 + 27 + 1 + 1 + 127 + 256;
        float1 = (float) double1;
        long1 = (long) float1;
        int1 = (int) long1;
        short1 = (short) int1;
        byte1 = (byte) short1;

        System.out.println("byte1 = " + byte1);

        System.out.println("SUM (integers only) = " + (byte1 + short1 + int1 + long1 + 0.0));
        System.out.println("SUM (all numbers) = " + (byte1 + short1 + int1 + long1 + float1 + double1));

        float1 = 2.1f;
        int1 = (int) float1;
        System.out.println("int1 - casting from 2.1: " + int1);

        float1 = 2.9f;
        int1 = (int) float1;
        System.out.println("int1 - casting from 2.9: " + int1);

        float1 = 2.1f;
        int1 = (int) (float1 + 0.5f);
        System.out.println("int1 - casting from 2.1 - trick: " + int1);

        float1 = 2.9f;
        int1 = (int) (float1 + 0.5f);
        System.out.println("int1 - casting from 2.9 - trick: " + int1);

        var x = float1;
        System.out.println("x from float: " + x);

        var y = short1;
        System.out.println("y from short: " + y);

//        var z;
//        z = byte1;
//        System.out.println("z from byte: " + z);

        final double PI = 3.14d;
        double r = 2;
        System.out.println("Circle area = " + PI * r * r);

//        PI = PI * PI;

        final String DOMINO_3_4 = "\uD83C\uDC4A";
        final String DOMINO_3_5 = "\uD83C\uDC4B";
        System.out.println("Domino 3 4 = " + DOMINO_3_4);
        System.out.println("Domino 3 5 = " + DOMINO_3_5);

        System.out.println("Byte MIN = " + Byte.MIN_VALUE);
        System.out.println("Byte MAX = " + Byte.MAX_VALUE);

        int1 = Integer.parseInt("-100");  // returns int
        System.out.println("int from String (parseInt) = " + int1);

        Integer integer1 = Integer.valueOf("-100");  // returns Integer
        System.out.println("int from String (valueOf) = " + integer1);

//        int futureValue = null;
        Integer futureValue = null;
        System.out.println("futureValue: " + futureValue);

//        Integer variableConstructor = new Integer(5);  // autoboxing not used
        Integer variableConstructor = 5;  // autoboxing
        System.out.println("variableConstructor: " + variableConstructor);
        int1 = variableConstructor; // unboxing
        int1 = variableConstructor.intValue(); // unboxing not used

        String s1 = "1000";
        String s2 = "1000";
        Integer n1 = Integer.valueOf(s1);
        Integer n2 = Integer.valueOf(s2);
        System.out.println("n1 == n2: " + (n1 == n2));
        System.out.println("n1 == n2 (equals): " + n1.equals(n2));

        n2 = 10;
        System.out.println("n1 compared to 10: " + n1.compareTo(n2));     // > 0 because n2 < n1
        n2 = 10000;
        System.out.println("n1 compared to 10000: " + n1.compareTo(n2));  // < 0 because n2 > n1
        n2 = n1;
        System.out.println("n1 compared to n2: " + n1.compareTo(n2));     // =0 because n1 == n2

        n2 = 9;
        System.out.println("min: " + Integer.min(n1, n2));
        System.out.println("max: " + Integer.max(n1, n2));

        s1 = String.valueOf(int1);
        s2 = Integer.toString(int1);
        System.out.println("String.valueOf = " + s1);
        System.out.println("Integer.toString = " + s2);

    }
}