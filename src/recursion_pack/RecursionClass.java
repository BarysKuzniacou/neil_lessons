package recursion_pack;

public class RecursionClass {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    private static int factorial(int n) {
        /*
        f(4) -> 4 * f(3)
        f(3) -> 3 * f(2)
        f(2)- > 2 * f(1)
        f(1) -> return 1;
        f(1) * f(2) * f(3) * f(4) = 1 -> 1 * 2 -> 2 -> 2 * 3 -> 6 -> 6 * 4 -> 24 = 24
        */
        if (n == 1) {
            return 1;
        }

        return n * factorial(n-1);
    }
}
