public class Main {
    public static void main(String[] args) {
        person p1 = new person() {

            void show() {
//                super.show();
                System.out.println("i am in main class.");
            }
        };
        p1.show();
    }
            }
