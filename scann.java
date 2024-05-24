import java.io.*;

public class scann {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/output.txt"));

            int count = 0;
            String character;

            while ((character = reader.readLine()) != null) {
                for (int i = 0; i < character.length(); i++) {
                    char ch = character.charAt(i);
                    ch = Character.toLowerCase(ch);

                    if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                        count++;
                    }
                }

            }

            writer.write(" " + count); // Write the count as string

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace(); // Print stack trace for IOException
        }
    }
}
