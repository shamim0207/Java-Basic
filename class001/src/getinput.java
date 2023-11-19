import java.util.Scanner;

public class getinput {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter your number: ");
        int number= input.nextInt();
        System.out.println("your number is: "+number);
    }
}