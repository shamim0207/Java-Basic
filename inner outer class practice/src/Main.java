class MyOuterClass {
    private int x;

    public MyOuterClass(int x) {
        this.x = x;
    }

    public void myOuterMethod() {
        System.out.println("Outer class variable x: " + x);
    }

    class MyInnerClass {
        private int innerX;

        public MyInnerClass(int innerX) {
            this.innerX = innerX;
        }

        public void myInnerMethod() {
            int sum = x + innerX;
            System.out.println("Inner class variable x: " + innerX);
            System.out.println("Sum of outer and inner class variables: " + sum);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyOuterClass outerObj = new MyOuterClass(10);
        outerObj.myOuterMethod();

        MyOuterClass.MyInnerClass innerObj = outerObj.new MyInnerClass(5);
        innerObj.myInnerMethod();
    }
}
