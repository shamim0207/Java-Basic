public class outputforbreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // Terminate the loop when i is 5
            if (i == 3)
                break;
            //when i ==3,brek the loop and and out from the loop
            System.out.println("i: " + i);
        }
        System.out.println("Out of Loop");
    }
}
