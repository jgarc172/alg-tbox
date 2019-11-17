import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {

    long[] fib = new long[3];
    fib[0] = 0;
    fib[1] = 1;
    if (n < 2) {
      return fib[n];
    }
    for (int i = 2; i <= n; i++) {
      fib[2] = fib[1] + fib[0];
      fib[0] = fib[1];
      fib[1] = fib[2];
    }
    return fib[2];
  }
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
