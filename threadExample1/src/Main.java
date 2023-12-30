public class Main {
    public static void main(String[] args) throws InterruptedException{
myThread thread1=new myThread("shamim");
        myThread thread2=new myThread("Tamim");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("main is terminating");

    }
}