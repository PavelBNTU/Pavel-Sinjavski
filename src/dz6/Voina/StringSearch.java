package dz6.Voina;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringSearch implements TextSearch {
    @Override
    public void search(String fileName, String searchText) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchText)) {
                    System.out.println("Найдено в строке " + lineNumber + ": " + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

