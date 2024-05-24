import  java.io.*;
public class readwrite
{
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("A.txt"));
            for (int i = 1; i <= 10 ; i++) {
                writer.write(i+"\n");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader("A.txt"));
            String line;
            int sum = 0, count = 0;
            float avg;
            int [] str = new int [10];
            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < 10; i++) {
                    str [i] = Integer.parseInt(line);
                    sum += str[i];
                    count++;
                }
            }

            reader.close();

            avg = (float) sum /count;

            BufferedWriter writer1 = new BufferedWriter(new FileWriter("out.txt"));
            writer1.write(avg+ " ");

            writer1.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}