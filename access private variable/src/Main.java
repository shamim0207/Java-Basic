import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        test test1=new test();
        test1.sum= test1.getA()+test1.getB();
        System.out.println("the sum is : "+test1.sum);
    }
}