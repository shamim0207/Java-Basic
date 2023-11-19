public class Main {
    public static void main(String[] args) {
        CallValue cv1=new CallValue();
        int x=10;
        System.out.println("before call change method: "+x);
        cv1.change(x);
        System.out.println("after call changed method: "+x);
    }
}
