public class pattern002 {
    public static void main(String[] args) {
        int n = 7;

        for (int i = n; i >=1; i--) {
            for (int j = 1; j < i; j++) {

                System.out.print("* ");

            }
            System.out.println(); // Move this line outside of the inner loop
        }
    }
}
