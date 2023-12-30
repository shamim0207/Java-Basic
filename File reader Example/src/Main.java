import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {

        try {
            BufferedReader reder=new BufferedReader(new FileReader("input.txt"));
          String line ;
           while((line= reder.readLine())!=null)
            System.out.println(line
            );
            reder.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}