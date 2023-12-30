import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int number,number2;
Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number1:");
number= sc.nextInt();
        System.out.println("Enter your number2:");
number2= sc.nextInt();

        System.out.println("your number is = "+number+"," +number2);
        int sum=0;
        sum=number+number2;
        System.out.println("the sum is= "+sum);
        
    }
}