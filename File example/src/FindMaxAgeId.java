import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindMaxAgeId {

    public static String findMaxAgeId(String filename) throws IOException {
        String maxAgeId = null;
        int maxAge = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("/");
                int age = Integer.parseInt(parts[1]);
                if (age > maxAge) {
                    maxAge = age;
                    maxAgeId = parts[0];
                }
            }
        }

        return maxAgeId;
    }

    public static void main(String[] args) throws IOException {
        String filename = "person.txt";
        String maxAgeId = findMaxAgeId(filename);
        System.out.println("The id of the person with the maximum age is: " + maxAgeId);
    }
}
