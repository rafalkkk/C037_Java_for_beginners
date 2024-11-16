package eu.mobilo24.java101;

public class Strings {
    public static void main(String[] args) {

        String harry = "Harry Potter";
        System.out.println(harry);

        String draco = new String("Draco Malfoy");
        System.out.println(draco);

        String text;
        text = harry + " and " + draco + " are good friends.";
        System.out.println(text);

        text = harry.concat(" and ").concat(draco).concat(" learn Java-magic together.");
        System.out.println(text);

        String tom = "Tom Marvolo Riddle";
        text = tom + " is another Java adept. His name has " + tom.length() + " letters.";
        System.out.println(text);

        text = "When you change order of letters in " + tom + "'s name you have: \n" +
                "\tI'm\n\t\tLord\n\t\t\tVoldemort";
        System.out.println(text);

        text = "But it's just a coincidence";
        System.out.println(text.toUpperCase());

        String notValidVar = null;
        text = notValidVar;
        System.out.println(text);

        System.out.print("\u001B[30;107m" + harry + "\u001B[0m "); // Black on white
        System.out.print("\u001B[97;44m" + draco + "\u001B[0m "); // White on blue
        System.out.println("\u001B[97;41m" + tom + "\u001B[0m "); // White on red

        String sentence = "cat in the bottle";
        boolean result = sentence.contains("bottle");
        System.out.println(result);
        result = sentence.contains("Bottle");
        System.out.println(result);

        result = sentence.startsWith("cat");
        System.out.println(result);

        result = sentence.endsWith(".");
        System.out.println(result);

        String word = "cat";
        String repeated = word.repeat(3);
        System.out.println(repeated);

        sentence = "   cat\n\t\t";
        System.out.print("." + sentence + ".");
        System.out.println();

        String stripped = sentence.strip();
        System.out.print("." + stripped + ".");
        System.out.println();

        System.out.print("." + sentence + ".");
        System.out.println();
        String trimmed = sentence.trim();
        System.out.print("." + trimmed + ".");
        System.out.println();

        sentence = "Dogs are cool!";
        String part = sentence.substring(9, 13);
        System.out.println(part);

        int index = sentence.indexOf("cool");
        System.out.println(index);

        boolean matches = sentence.matches(".*cool.*");
        System.out.println(matches);

        String bowl = "milk";
        boolean isEmpty = bowl.isEmpty();
        System.out.println(isEmpty);

        String cat1 = "cat";
        String cat2 = new String("cat");
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1 == cat2);

        String txt1 = "MAGIC";
        System.out.println(System.identityHashCode(txt1));
        String txt2 = "MAGIC";
        System.out.println(System.identityHashCode(txt2));

        String txt3 = new String("MAGIC");
        System.out.println(System.identityHashCode(txt3));
        String txt4 = new String("MAGIC");
        System.out.println(System.identityHashCode(txt4));

        System.out.println(txt1 == txt2);
        System.out.println(txt1 == txt3);
        System.out.println(txt3 == txt4);
    }
}