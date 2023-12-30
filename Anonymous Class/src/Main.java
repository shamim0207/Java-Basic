public class Main {
    public static void main(String[] args) {
        person engineer=new person() {
            @Override
            public void introduce() {
                System.out.println("hello i am engineer.");
            }
            };
        person doctor=new person() {
            @Override
            public void introduce() {
                System.out.println("hello i am doctor.");
            }
        };
        engineer.introduce();
        doctor.introduce();
    }
}