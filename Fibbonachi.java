//2. fibbonacci series 1 to 20 using recursion

public class Fibbonachi {
    public static void main(String[] args) {
        int n = 20;
        int result = fib(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fib(i)+" ");
        }
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
