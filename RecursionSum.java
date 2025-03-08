//3.sum of digits using recusion
public class RecursionSum {public static void main(String[] args) {
    int n = 12345;
    System.out.println(sum(n));
}
    public static int sum(int n) {
        if (n == 0)
            return 0;
        else
            return (n % 10) + sum(n / 10);
    }
}
