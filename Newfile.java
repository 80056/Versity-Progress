import java.io.*;
public class Newfile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/output.txt"));
            int sum = 0;
            int count = 0;
            String word;
            while ((word = reader.readLine())!=null){
                for (int i = 0; i < word.length(); i++) {
                    char ch = word.charAt(i);
                    if(Character.isDigit(ch)){
                       sum += Character.getNumericValue(ch);
                       count++;
                    }
                }
            }
            writer.write(" "+sum/count);
            writer.close();
            reader.close();

        } catch (Exception e){

        }
    }
}
