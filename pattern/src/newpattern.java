public class newpattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                    System.out.print("*");

            }
            System.out.println(); // Move this line outside of the inner loop
        }
    }
}
