package dz6.Voina;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordFrequencyCounter {

    private String filePath;

    public WordFrequencyCounter(String filePath) {
        this.filePath = filePath;
    }

    public int countWordFrequency(String targetWord) {
        int count = 0;
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.equalsIgnoreCase(targetWord)) {
                    count++;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return count;
    }
}