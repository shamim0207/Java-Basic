public class pattern003 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Use print instead of println
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
