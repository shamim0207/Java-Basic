public class Main {
    public static void main(String[] args) {
        OuterClass out1=new OuterClass();
       OuterClass.Innerclass inner1=out1.new Innerclass();
       inner1.message();
    }
}