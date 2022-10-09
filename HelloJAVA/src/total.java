import java.util.Scanner;

public class total {
  public static void main(String[] args) throws Exception {
    int a, b;
    System.out.println("nhap a b:");
    Scanner scanner = new Scanner(System.in);
    a = scanner.nextInt();
    b = scanner.nextInt();
    System.out.println("\n tong la: " + (a + b));
    System.out.println("\n hieu la: " + (a - b));
    System.out.println("\n tich la: " + (a * b));
    System.out.format("\n thuong la: %.4f", ((float) (a) / b));
  }
}
