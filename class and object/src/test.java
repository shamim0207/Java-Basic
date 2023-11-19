import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //create object for access another class
        Teacher teacher1= new Teacher();
        //class name object name = new diye initialization
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name: ");
        String name=sc.next();
        System.out.println("enter your gender: ");
        String gender=sc.next();
        System.out.println("enter your district: ");
        String district=sc.next();
        System.out.println("enter your id: ");
        int id=sc.nextInt();
        System.out.println("enter your phone: ");
        long phone=sc.nextInt();
    }
}
