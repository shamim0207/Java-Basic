import java.util.Scanner;
public class conditions {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("equal.");
        } else if (a<b) {
            System.out.println("a less than b.");

        }
        else if (a>b){
            System.out.println("a getter than b.");
        }
    }
}
