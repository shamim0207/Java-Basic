public class Main {
    public static void main(String[] args) {
            threadDemo thread1 = new threadDemo();
            threadDemo thread2 = new threadDemo();
            thread1.run();
            thread2.run();
        }
    }