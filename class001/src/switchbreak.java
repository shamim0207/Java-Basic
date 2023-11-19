public class switchbreak {
    public static void main(String[] args) {
        int i = 2;
        switch (i) {
            case 0:
                System.out.println("i is zero.");
                break;
            case 1:
                System.out.println("i is one.");
                break;
            case 2:
                System.out.println("i is two.");
                break;
                //condition is i=2.that means only print the condition i==2
            default:
                System.out.println("Invalid number");
        }
    }
}
