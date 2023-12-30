public class CountNumbers implements Runnable{
    public static int counter=1;
    int n;
    Thread t;
    CountNumbers(int n)
    {    this.n=n;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        while(true){
            if(counter>n) break;
            System.out.println(counter++);
        }
    }


}
