import javax.naming.Name;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class functions {
    public static void myname(String Name){
        String name= Name;
        System.out.println("my name is "+name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name: ");
       String ppp= sc.next();
        myname(ppp);


    }
}