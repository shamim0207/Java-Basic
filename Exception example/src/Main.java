public class Main {
    public static void main(String[] args) {
        int i=30;
        int j=0;
        System.out.println("Hello world!");
        try {
            int result=i/j;
            System.out.println("your output is: "+result);
        }catch (ArithmeticException e){
            System.out.println("exception: "+e.getMessage());
        }try {
            String name =null;
            System.out.println("name: "+name.charAt(1));
        } catch(NullPointerException e){
            System.out.println("error: "+e.getMessage());
        }
    }
}