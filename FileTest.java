import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/output.txt"));

            int count = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase();

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);

                    if (!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')) {
                        count++;
                    }
                }
            }

            writer.write(" "+count); // Write the count as string

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace(); // Print stack trace for IOException
        }
    }
}
