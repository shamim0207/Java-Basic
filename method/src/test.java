import java.util.Scanner;

public class test {
    public static void main(String[] args) {
       Student student1= new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name: ");
        student1.name=sc.next();
        System.out.println("enter your gender: ");
        student1. gender=sc.next();
        System.out.println("enter your district: ");
        student1. district=sc.next();
        System.out.println("enter your id: ");
        student1. id=sc.nextInt();
        System.out.println("enter your phone: ");
        student1. phone=sc.nextInt();
        student1.displayinformation();
    /* for calling method
    create a object
    object name.method name
     */
    }
}
