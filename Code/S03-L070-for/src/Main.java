import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5 ; i++) {
            System.out.println("i = " + i);
        }

        for (int j = 10; j > 0; j-=2)
        {
            System.out.println("j = " + j);
        }

        for (int k = 10; k < 5; k-=2)
        {
            System.out.println("k = " + k);
        }

        for(int i=1; i<5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print(String.format("%3d", i * j) + " ");
            }
            System.out.println();
        }

        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(5,13,18,25,32,38));
        boolean isIncreasing = true;

        if(list1.size()<2){
            System.out.println("List is too short!");
        }else{
            for (int currentPosition =1; currentPosition < list1.size(); currentPosition++) {
                Integer i1 = list1.get(currentPosition-1);
                Integer i2 = list1.get(currentPosition);
                if(i1 >= i2){
                    System.out.println("The sequence is not increasing (position " + currentPosition + " i1="+i1+" i2="+i2+")");
                    isIncreasing = false;
                    break;
                } else {
                    System.out.println("The sequence is still increasing (position " + currentPosition + " i1="+i1+" i2="+i2+")");
                }
            }
        }
        if (isIncreasing)
            System.out.println("The sequence is increasing.");
        else
            System.out.println("The sequence is NOT increasing");


        System.out.println("ArrayList = " + list1);
        for(int n=0; n<list1.size(); n++) {
            if (list1.get(n).equals(13)) {
                System.out.println("Removing item at " + n);
                list1.remove(n);
                n--;
            } else {
                System.out.println("Keeping item at " + n);
            }
        }
        System.out.println("ArrayList = " + list1);


        System.out.println("ArrayList before doubling = " + list1);
        for (int n=0; n<list1.size(); n++){
            System.out.print(list1.get(n)*2 + " ");
        }
        System.out.println();

        System.out.println("ArrayList before dividing= " + list1);
        for(Integer number : list1){
            System.out.print(number/2 + " ");
        }
        System.out.println();
    }
}