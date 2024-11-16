package eu.mobilo24.java101;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        int max_i = 5;
        while (i < max_i) {
            System.out.println("Iteration: i: " + i);
            i++;
        }

        int j = 10;
        int min_j = 0;
        while (j > min_j) {
            System.out.println("Iteration: j: " + j);
            j-=2;
        }

        int k = 10;
        int max_k = 5;
        while (k < max_k) {
            System.out.println("Iteration: k: " + k);
            k++;
        }

        do {
            System.out.println("Iteration: k: " + k);
            k++;
        } while (k < max_k);


        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(5,13,13,18,25,32,38));
        boolean isIncreasing = true;

        if(list1.size()<2){
            System.out.println("List is too short!");
        }else{
            Integer i1;
            Integer i2;
            int currentPosition = 1;

            while (currentPosition < list1.size()){
                i1 = list1.get(currentPosition-1);
                i2 = list1.get(currentPosition);
                if(i1 >= i2){
                    System.out.println("The sequence is not increasing (position " + currentPosition + " i1="+i1+" i2="+i2+")");
                    isIncreasing = false;
                    break;
                } else {
                    System.out.println("The sequence is still increasing (position " + currentPosition + " i1="+i1+" i2="+i2+")");
                }
                currentPosition++;
            }
        }
        if (isIncreasing)
            System.out.println("The sequence is increasing.");
        else
            System.out.println("The sequence is NOT increasing");


        System.out.println("ArrayList = " + list1);
        int n = 0;
        while (n < list1.size()){
            if (list1.get(n).equals(13)) {
                System.out.println("Removing item at " + n);
                list1.remove(n);
            }
            else{
                System.out.println("Keeping item at " + n);
                n++;
            }
        }
        System.out.println("ArrayList = " + list1);
    }
}