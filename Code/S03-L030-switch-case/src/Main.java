public class Main {
    public static void main(String[] args) {

        int qualityNumber = 4;
        String qualityDescription = "";

        switch (qualityNumber) {
            case 1:
                qualityDescription = "Top quality";
                break;
            case 2:
                qualityDescription = "Top quality but box was open";
                break;
            case 3:
                qualityDescription = "Product slightly used";
                break;
            case 4:
                qualityDescription = "Product not functional or damaged";
                break;
            default:
                qualityDescription = "Scrap";
        }

        System.out.println(qualityDescription);



        String day = "Tuesday";

        switch (day) {
            case "Monday":
                System.out.println("Start of the week");
                break;
            case "Friday":
                System.out.println("End of the week");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Midweek day");
                break;
        }
    }
}