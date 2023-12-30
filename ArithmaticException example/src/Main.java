public class Main {
    public static void main(String[] args) {
        Math m = new Math();
        int n = 4;
        int d = 0;
        try{
            System.out.println(m.divide(n,d));

        }catch (ArithmeticException e){
            System.out.println("exception is: "+e.getMessage());
        }finally {
            System.out.println("Complete");
        }

    }
}