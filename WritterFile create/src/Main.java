import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter writter=new BufferedWriter(new FileWriter("student.txt"));
            writter.write("writting to a file.");
            writter.write("\nwhere is another text.");
            writter.write("\nmy name is shamim.");
            writter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}