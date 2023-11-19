
    public class breakexample {
        public static void main( String args[] ) {
            for ( int row = 0; row < 5; row++ ) {
                System.out.println("Outer loop: " +  row);
                for (int column = 0; column < 4 ; column++) {
                    System.out.print(column   +" ");
                    if ( ((row + column) % 2 ) == 0 ) {
                        System.out.println("Break " );
                        break;//this break continue execution from outer loop
                    }
                }
            }
        }
    }

