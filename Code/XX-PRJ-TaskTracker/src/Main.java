import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long startTime = 0;
        long endTime = 0;
        boolean taskStarted = false;

        while (true) {
            System.out.print("Wprowadź komendę (START/STOP/EXIT): ");
            String command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "START":
                    if (!taskStarted) {
                        System.out.println("Wprowadź opis zadania, ktore wykonujesz:");
                        String taskName = scanner.nextLine().trim();
                        startTime = System.currentTimeMillis();
                        taskStarted = true;
                        System.out.println("START: " + taskName);
                    } else {
                        System.out.println("Zadanie jest już w toku.");
                    }
                    break;
                case "STOP":
                    if (taskStarted) {
                        endTime = System.currentTimeMillis();
                        taskStarted = false;
                        long duration = endTime - startTime;
                        System.out.println("STOP: Czas trwania: " + (duration / 60000) + " minut.");
                    } else {
                        System.out.println("Nie rozpoczęto żadnego zadania.");
                    }
                    break;
                case "EXIT":
                    System.out.println("Program zakończony.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Nieznana komenda. Proszę użyć START, STOP lub EXIT.");
                    break;
            }
        }
    }
}
