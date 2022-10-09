import java.util.Scanner;
// import java.math.BigInteger;

public class phuongtrinhbatnhat {
  int a, b, c;
  float dental;
  int n;

  void nhap() {
    System.out.println("nhap he so cua pt: Ax^2 +Bx +C=0:");
    Scanner scanner = new Scanner(System.in);
    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();
    dental = (b * b) - 4 * a * c;
    scanner.close();
  }

  void xuat() {
    if (a == 0) {
      System.out.println("phuong trinh tro thanh phuong trinh bac nhat!");
      if (b == 0) {
        System.out.println("phuong trinh vo nghiem");
      } else {
        System.out.format("phuong trinh co nghiem la: %.2f", ((float) (-c) / b));
      }
    } else {
      if (dental < 0) {
        System.out.println("phuong trinh vo nghiem");
      } else if (dental == 0) {
        System.out.format("phuong trinh co nghiem kep: %.2f", ((float) (-b) / (2 * a)));
      } else {
        System.out.format("phuong trinh co hai nghiem phan biet: x1 = %.2f x2= %.2f",
            (((-b + Math.sqrt(dental)) / (float) (2 * a))),
            (((-b - Math.sqrt(dental)) / (float) (2 * a))));
      }
    }
  }

  // in n
  void out() {
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("nhap n");
      n = scanner.nextInt();
    } while (n >= 10 || n < 0);
    boolean result = true;
    if (n < 2) {
      result = false;
    } else {
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          result = false;
          break;
        }
      }
    }
    if (result) {
      System.out.println("n la so nguyen to");
    } else {
      System.out.println("khong phai");
    }
  }

  public static void main(String[] args) throws Exception {
    // int a,
    // System.out.println("nhap he so cua phuong trinh Ax+b=0;");
    // Scanner scanner = new Scanner(System.in);
    // a = scanner.nextInt();
    // b = scanner.nextInt();
    // if (a == 0) {
    // System.out.println("\nphuong trinh vo nghiem");
    // } else {
    // System.out.format("phuong trinh co nghiem la: %.2f", ((float) (-b) / a));
    // }
    // phuongtrinhbatnhat a = new phuongtrinhbatnhat();
    // a.nhap();
    // a.xuat();
    phuongtrinhbatnhat b = new phuongtrinhbatnhat();
    b.out();
  }
}