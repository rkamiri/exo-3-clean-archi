package utilities.fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CalculatorFileReader implements IFileReader {
    @Override
    public List<Integer> readFile(File file) {
        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // à sortir dans une méthode
                try {
                    int number = Integer.parseInt(line);
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid number format: " + line);
                }
            }
        } catch (IOException e) {
            // Handle file reading error
            e.printStackTrace();
            return new ArrayList<Integer>();
        }

        return numbers;
    }
}
