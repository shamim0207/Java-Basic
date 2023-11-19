public class pattern004 {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j < i; j++) {

                System.out.print(j+" ");

            }
            System.out.println(); // Move this line outside of the inner loop
        }
    }
}
