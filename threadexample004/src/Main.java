public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountNumbers t1=new CountNumbers(10);
              CountNumbers t2=new CountNumbers(5);
                 t1.t.join();
                t2.t.join();
                 System.out.println("Count completed");
    }
}