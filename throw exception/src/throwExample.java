public class throwExample {
    public void check(int age){
        if(age>18){
            System.out.println("you are eligible.");
        }else{
            throw new ArithmeticException("you are not eligible.");
        }
    }
}
