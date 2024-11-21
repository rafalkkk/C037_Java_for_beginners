import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // Losowanie liczby od 1 do 100
        int numberOfAttempts = 0;
        int guess = 0;

        System.out.println("Witaj w grze 'Zgadnij Liczbę'!");
        System.out.println("Komputer wylosował liczbę od 1 do 100. Spróbuj ją odgadnąć!");

        while (guess != numberToGuess) {
            System.out.print("Podaj swoją liczbę: ");
            guess = scanner.nextInt();
            numberOfAttempts++;

            if (guess < numberToGuess) {
                System.out.println("Za nisko! Spróbuj wyżej.");
            } else if (guess > numberToGuess) {
                System.out.println("Za wysoko! Spróbuj niżej.");
            } else {
                System.out.println("Gratulacje! Odgadłeś liczbę w " + numberOfAttempts + " próbach.");
            }
        }

        scanner.close();
    }
}
