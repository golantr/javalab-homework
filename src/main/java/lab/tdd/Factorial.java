package lab.tdd;

public class Factorial {

    public static long compute(int i) {
        if (i < 0) {
            throw new ArithmeticException();
        }
        if (i == 0 || i == 1) {
            return 1;
        }
        return i * compute(i - 1);
    }
}
