import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConsonantCounter {
    public static void main(String[] args) {
        // Define input and output file paths
        String inputFile = "src/input.txt";
        String outputFile = "src/output.txt";

        try {
            // Call method to count consonants in input file
            int consonantCount = countConsonants(inputFile);
            // Write consonant count to output file
            writeOutput(outputFile, consonantCount);
            // Print message indicating success
            System.out.println("Consonant count written to output.txt");
        } catch (IOException e) {
            // Print error message if an exception occurs
            System.out.println("An error occurred: " + e.getMessage());
            // Print stack trace for debugging purposes
            e.printStackTrace();
        }
    }

    // Method to count consonants in the input file
    private static int countConsonants(String inputFile) throws IOException {
        // Initialize counter for consonants
        int count = 0;
        // Use try-with-resources to auto-close resources after use
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            // Read each line from the input file
            String line;
            while ((line = reader.readLine()) != null) {
                // Convert line to lowercase for uniformity
                line.toLowerCase();
                // Iterate over each character in the line
                for (int i = 0; i < line.length(); i++) {
                    // Get the character at index i
                    char ch = line.charAt(i);
                    // Check if the character is a letter and not a vowel
                    if ((Character.isDigit(ch))) {
                        // Increment consonant count if it's a digit
                        count++;
                    }
                }
            }
        }
        // Return the total count of consonants in the file
        return count;
    }

    // Method to write the consonant count to the output file
    private static void writeOutput(String outputFile, int consonantCount) throws IOException {
        // Use try-with-resources to auto-close resources after use
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            // Write the consonant count as a string to the output file
            writer.write(String.valueOf(consonantCount));
        }
    }
}

