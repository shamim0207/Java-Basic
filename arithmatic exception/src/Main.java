public class Main {
    public static void main(String[] args) {
        int a=20;
        int b=0;

        System.out.println("Shamim");
//        System.out.println("output: "+result);
        try {
          double  result = a / b;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("efootball.");
    }
}