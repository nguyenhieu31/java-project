import java.util.Random;
import java.util.Scanner;

public class sumofloop {
  public static int Ktra(int n) {
    if (n < 2) {
      return 0;
    } else {
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          return 0;
        }
      }
    }
    return 1;
  }

  public static void main(String[] args) throws Exception {
    int n;
    System.out.println("nhap n=");
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      if (Ktra(i) == 1) {
        System.out.println("cac so nguyen to " + n + ": " + i);
      }
    }
    // int sum = 0;
    // Random rand = new Random(100);
    // n = scanner.nextInt();
    // for (int i = 0; i < n; i++) {
    // int x = rand.nextInt();
    // System.out.println(x + " ");
    // sum += x;
    // }
    // System.out.println("tong cac so vua nhap la:" + sum);
  }
}
