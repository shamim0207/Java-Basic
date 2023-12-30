
import java.io.*;
import java.util.*;

public class Employee {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] ids = new int[n];
        int[][] scores = new int[n][6];

        for(int i=0; i<n; i++) {
            System.out.print("Enter name of employee " + (i+1) + ": ");
            names[i] = sc.next();

            System.out.print("Enter ID of employee " + (i+1) + ": ");
            ids[i] = sc.nextInt();

            System.out.print("Enter scores of last 6 months: ");
            for(int j=0; j<6; j++) {
                scores[i][j] = sc.nextInt();
            }
        }

        // Writing output to file
        File file = new File("employees.txt");
        FileWriter fw = new FileWriter(file);

        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int s : scores[i]) {
                sum += s;
            }
            int avg = sum/6;

            fw.write(names[i] + "\n");
            fw.write(ids[i] + "\n");
            fw.write(avg + "\n");
        }

        fw.close();

        // Finding employees with avg > 75
        File incrementFile = new File("increment.txt");
        fw = new FileWriter(incrementFile);

        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int s : scores[i]) {
                sum += s;
            }
            int avg = sum/6;

            if(avg > 75) {
                fw.write(names[i] + "\n");
            }
        }

        fw.close();

        // Finding maximum scorer
        int max = 0;
        List<String> topScorers = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int s : scores[i]) {
                sum += s;
            }
            int avg = sum/6;

            if(avg > max) {
                max = avg;
                topScorers.clear();
                topScorers.add(names[i]);
            }
            else if(avg == max) {
                topScorers.add(names[i]);
            }
        }

        System.out.println("Top Scorer(s): ");
        for(String name: topScorers) {
            System.out.println(name);
        }

    }

}
