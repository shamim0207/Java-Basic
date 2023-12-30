import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter oddwritter = new BufferedWriter(new FileWriter("odd.txt"));
            BufferedWriter evenwritter = new BufferedWriter(new FileWriter("even.txt"));
            String id;
            while ((id = reader.readLine()) != null) {
                int intValue = Integer.parseInt(id);
                if (intValue % 2 ==0) {
                    evenwritter.write(id+"\n");
                }else {
                    oddwritter.write(id+"\n");
                }
            }
            reader.close();
            oddwritter.close();
            evenwritter.close();

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
}
