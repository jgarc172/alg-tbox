import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        int[] fib = new int[3];
        fib[0] = 0;
        fib[1] = 1;
        if (n < 2) {
          return fib[n];
        }
        for (int i = 2; i <= n; i++) {
          fib[2] = (fib[1] + fib[0]) % 10;
          fib[0] = fib[1];
          fib[1] = fib[2];
        }
        return fib[2];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

