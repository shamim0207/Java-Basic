public class myThread extends Thread {
    myThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("hello from "+getName());
    }

}
