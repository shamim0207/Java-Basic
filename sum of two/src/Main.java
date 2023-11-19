import java.util.Scanner;
public class Main extends twosum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target ;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your target: ");
        target= sc.nextInt();
        int[] result = twoSum(nums, target);

        // Print the result
        if (result.length == 2) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
    }
