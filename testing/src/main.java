import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        person person1 = new person();

        person1.setName("shamim");
        person1.setAge(21);
        person1.setFavColour("blue");
        System.out.println("hi my name is : "+person1.getName());
        System.out.println("my age is : "+person1.getAge());
        System.out.println("okkh:  "+person1.getFavColour());

    }
}
