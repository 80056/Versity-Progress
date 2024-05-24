import java.io.*;
public class Nick {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("A.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("B.txt"));
            int[] ints = new int[100];
            int[] ints2 = new int[100];
            int[] sum = new int[100];
            String line;
            String line2;
            int i = 0;
            int j = 0;
            while((line = reader.readLine()) != null){
                ints[i] = Integer.parseInt(line);
                i++;
            }
            while((line2 = reader2.readLine()) != null){
                ints2[j] = Integer.parseInt(line2);
                j++;
            }
            for (int k = 0; k < 10; k++) {
                sum[k] = ints[k] + ints2[k];
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));
            for (int k = 0; k < 10; k++) {
                writer.write(sum[k] + " ");
            }
            reader.close();
            reader2.close();
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
}

