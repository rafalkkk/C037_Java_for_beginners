package eu.mobilo24.java101;


public class Main {
    public static void main(String[] args) {

        int amount = 0;
        int newAmount = 30;
        amount = amount + newAmount;
        System.out.println("amount + newAmount = " + amount);

        newAmount = 113;
        amount += newAmount;  //compound assignment
        System.out.println("amount + newAmount = " + amount);

        amount *= 3;
        System.out.println("amount * 3 = " + amount);

        System.out.println("amount++ = " + amount++);
        System.out.println("amount = " + amount);
        System.out.println("--amount = " + --amount);

        int oneColor = amount / 4;
        System.out.println("oneColor = " + oneColor);
        int rest = amount % 4;  // modulo
        System.out.println("rest = " + rest);

        float oneColorAvg = amount / 4;
        System.out.println("oneColorAvg = " + oneColorAvg);

        oneColorAvg = amount / 0.0f;
        System.out.println("oneColorAvg = " + oneColorAvg);

        int result = 8 / 2 * (2 + 2);
        System.out.println("result = " + result);

        result = 3 * (5 + 20 / 2 * 5);
        System.out.println("result = " + result);

        System.out.println("1 == 1 " + (1==1));
        System.out.println("1 != 1 " + (1!=1));
        System.out.println("1 >= 1 " + (1>=1));
        System.out.println("1 <= 1 " + (1<=1));
        System.out.println("1 > 1  " + (1>1));
        System.out.println("1 < 2  " + (1<2));
    }
}