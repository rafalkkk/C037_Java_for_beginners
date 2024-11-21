import java.io.*;
import java.nio.file.*;
import java.util.*;

public class AdventureGenerator {
    private static final String NOUNS_FILE = "nouns.txt";
    private static final String VERBS_FILE = "verbs.txt";
    private static final String SENTENCES_FILE = "sentences.txt";

    public static void main(String[] args) {
        createFileIfNotExists(NOUNS_FILE, Arrays.asList("bear", "forest", "honey", "tree", "friend", "adventure", "river", "hill", "path", "flower"));
        createFileIfNotExists(VERBS_FILE, Arrays.asList("run", "jump", "explore", "find", "eat", "climb", "swim", "play", "laugh", "hug"));
        createFileIfNotExists(SENTENCES_FILE, Arrays.asList(
                "**noun** loves to **verb** in the forest.",
                "In the morning, **noun** likes to **verb**.",
                "At noon, **noun** will **verb** with friends.",
                "By the river, **noun** likes to **verb**.",
                "**noun** decided to **verb** up the tree.",
                "**noun** always wants to **verb** honey.",
                "During the day, **noun** and friends **verb** a lot.",
                "Sometimes, **noun** will **verb** to the hill.",
                "**noun** cannot wait to **verb** the path.",
                "**noun** and friends love to **verb** near flowers."
        ));

        List<String> nouns = readLinesFromFile(NOUNS_FILE);
        List<String> verbs = readLinesFromFile(VERBS_FILE);
        List<String> sentences = readLinesFromFile(SENTENCES_FILE);

        Random random = new Random();

        List<String> generatedSentences = new ArrayList<>();
        for (String sentence : sentences) {
            String noun = nouns.get(random.nextInt(nouns.size()));
            String verb = verbs.get(random.nextInt(verbs.size()));
            String newSentence = sentence.replace("**noun**", noun).replace("**verb**", verb);
            generatedSentences.add(newSentence);
        }

        System.out.println("Generated Adventure Sentences:");
        for (String sentence : generatedSentences) {
            System.out.println(sentence);
        }
    }

    private static void createFileIfNotExists(String fileName, List<String> lines) {
        File file = new File(fileName);
        if (!file.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (String line : lines) {
                    writer.write(line);
                    writer.newLine();
                }
                System.out.println("File " + fileName + " created and initialized.");
            } catch (IOException e) {
                System.err.println("Failed to create and initialize file: " + fileName);
                e.printStackTrace();
            }
        }
    }

    private static List<String> readLinesFromFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            System.err.println("Failed to read file: " + fileName);
            e.printStackTrace();
        }
        return lines;
    }
}
