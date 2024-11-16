package eu.mobilo24.java101;

public class Main {
    public static void main(String[] args) {

        boolean isBeautiful = true;
        boolean isYoung = true;
        boolean isRich = true;

        boolean isCool = isBeautiful & isYoung & isRich;
        System.out.println("All conditions met: " + isCool);

        boolean isPrettyGood = isBeautiful | isYoung | isRich;
        System.out.println("All conditions met: " + isPrettyGood);

        boolean isAltCool = !isBeautiful & !isYoung & !isRich;
        System.out.println("Alt conditions met: " + isAltCool);

        final short LIGHT_ON     = 1;  // 00000001
        final short AIRCOND_ON   = 2;  // 00000010
        final short TEMP_ON      = 4;  // 00000100
        final short HUMIDITY_ON  = 8;  // 00001000
        final short DUST_ON      = 16; // 00010000

        short status = 9;

        System.out.println("LIGHT       : " + (status & LIGHT_ON));
        System.out.println("AIRCOND     : " + (status & AIRCOND_ON));
        System.out.println("TEMP        : " + (status & TEMP_ON));
        System.out.println("HUMIDITY    : " + (status & HUMIDITY_ON));
        System.out.println("DUST        : " + (status & DUST_ON));

        short new_status = LIGHT_ON | AIRCOND_ON | TEMP_ON;
        System.out.println("New status  : " + new_status);

        boolean isWise = true;
        boolean isStupid = true;
        System.out.println("Wise XOR Stupid: " + (isWise ^ isStupid));

        isBeautiful = false;
        isYoung = true;
        isRich = false;

        isCool = isBeautiful && isYoung && isRich;
        System.out.println("All conditions met: " + isCool);

        isPrettyGood = isBeautiful || isYoung || isRich;
        System.out.println("All conditions met: " + isPrettyGood);


    }
}