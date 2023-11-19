public class Main {
    public static void main(String[] args) {
        CallReference cr1=new CallReference();
        cr1.name="Tahsan";
        cr1.age=21;
        System.out.println("before call change method: "+cr1.name +" "+cr1.age);
        cr1.change(cr1);
        System.out.println("after call change method: "+cr1.name +" "+cr1.age);
    }
}
