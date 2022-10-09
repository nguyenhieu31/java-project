import java.util.*;

class ptbn {
  int hsb1, hsb0;

  ptbn() {
  }

  ptbn(int hsb1, int hsb0) {
    this.hsb1 = hsb1;
    this.hsb0 = hsb0;
  }

  void nhap() {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap he so b1: ");
    this.hsb1 = sc.nextInt();
    System.out.println("nhap he so b0: ");
    this.hsb0 = sc.nextInt();
  }

  void giai() {
    if (this.hsb1 == 0) {
      System.out.println("phuong trinh vo nghiem");
    } else {
      System.out.format("phuong tring co nghiem la: %.2f", (double) (-this.hsb1) / this.hsb0);
    }
  }

  int getHsb1() {
    return this.hsb1;
  }

  int getHsb0() {
    return this.hsb0;
  }
}

public class ptb1 extends ptbn {
  int hsb2;

  void nhap() {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap he so b2: ");
    this.hsb2 = sc.nextInt();
    super.nhap();
  }

  void giai() {
    if (this.hsb2 == 0)
      super.giai();
    else {
      System.out.println("hihi");
      double denta = Math.pow(super.getHsb1(), 2) - 4 * this.hsb2 * super.getHsb0();
      if (denta < 0) {
        System.out.println("phuong trinh vo nghiem");
      } else if (denta == 0) {
        System.out.format("phuong trinh co nghiem kep: %.2f", (double) (-super.getHsb1()) / (2 * this.hsb2));
      } else {
        System.out.format("phuong trinh co 2 nghiem : x1= %.2f va x2= %.2f",
            (-Math.pow(super.getHsb1(), 2) + Math.sqrt(denta)) / (double) (2 * this.hsb2),
            (-Math.pow(super.getHsb1(), 2) - Math.sqrt(denta)) / (double) (2 * this.hsb2));
      }
    }
  }

  public static void main(String[] args) {
    ptb1 m = new ptb1();
    m.nhap();
    m.giai();
  }
}
