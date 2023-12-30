public class Main {
    public static void main(String[] args) throws InterruptedException {
int array[]= {10,20,30,40};
SumThread thread1=new SumThread(array);
Thread thread=new Thread(thread1);
thread.start();
thread.join();
        System.out.println("SUM: "+thread1.sum);
    }
}