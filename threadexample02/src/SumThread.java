public class SumThread implements Runnable {
    int array[];
    int sum=0;
    SumThread(int a[]){
        this.array=a;
    }
    public void run(){
        for(int x:array){
            sum=sum+x;
        }
    }
}
