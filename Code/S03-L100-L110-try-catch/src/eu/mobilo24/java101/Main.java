package eu.mobilo24.java101;

import java.util.Scanner;
import java.io.*;
import java.nio.file.AccessDeniedException;


public class Main {
    public static void main(String[] args)   {
        int a = 10;
        int b = 2;
        Integer[] intArray = {1,2,3, null};
        int idx = 2;

        try {
            System.out.println("Division: " + a / b);
            System.out.println("Item at position " + idx + ": " + intArray[idx]);
            Integer i = intArray[idx];
            System.out.println(i.toString());
        } catch(ArithmeticException e) {
            System.out.println("We have an error: " + e.toString());
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range..." + e);
        } catch(NullPointerException e) {
            System.out.println("Null pointer..." + e.toString());
        } catch(Exception e) {
            System.out.println("Other error..." + e.toString());
            e.printStackTrace();
        }

//        boolean isOk = false;
//        Scanner scanner = new Scanner(System.in);
//        while (!isOk) {
//            try {
//                System.out.println("Enter a number:");
//                b = scanner.nextInt();
//                isOk = true;
//            } catch (Exception e) {
//                System.out.println("You need to enter a valid number! Try again.");
//                scanner.nextLine();
//            }
//        }
//        scanner.close();


        String path = "c:\\temp\\existing-file.txt";
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = br.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
            System.out.println(content);
        } catch (FileNotFoundException e) {
            System.out.println("Error: Cannot find file: " + path);
        } catch (AccessDeniedException e) {
            System.out.println("Error: No read access to file: " + path);
        } catch (IOException e) {
            System.out.println("Error: Cannot read file: " + path);
        }
        finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error: Cannot close buffer reader for " + path);
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("Error: Cannot close file reader for " + path);
                }
            }
            System.out.println("All actions executed!");
        }
    }
}