public class Math {
    public int divide(int a, int b) throws DivbyZero {
        if (b == 0) {
            throw new DivbyZero();
        }
        return a / b;
    }
}


