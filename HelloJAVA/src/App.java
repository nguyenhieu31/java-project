import java.util.Scanner;
import java.util.*;

class sinhvien {
    public String hoten;
    public String quequan;
    public double dtb;

    sinhvien() {
    }

    sinhvien(String hoten, String quequan, double dtb) {
        this.hoten = hoten;
        this.quequan = quequan;
        this.dtb = dtb;
    }

    public String getHoten() {
        return this.hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getquequan() {
        return this.quequan;
    }

    public void setquequan(String quequan) {
        this.quequan = quequan;
    }

    public double getdtb() {
        return this.dtb;
    }

    public void setdtb(double dtb) {
        this.dtb = dtb;
    }

    public String toString() {
        return hoten + "," + quequan + "," + dtb;
    }

    void input() {

    }

    void output() {

    }
}

public class App {
    Scanner sc = new Scanner(System.in);
    int n;
    ArrayList<sinhvien> sv = new ArrayList<sinhvien>();

    void input() {
        System.out.println("nhap vao so luong hoc sinh:");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sinhvien e = new sinhvien();
            System.out.print("ho ten:");
            e.hoten = sc.next();
            System.out.print("que quan:");
            e.quequan = sc.next();
            System.out.print("dtb:");
            e.dtb = sc.nextDouble();
            sv.add(e);
        }
    }

    void output() {
        for (int i = 0; i < sv.size(); i++) {
            System.out.println("ho ten sinh vien:" + sv.get(i).getHoten() + "Que quan:" + sv.get(i).getquequan()
                    + "diem trung binh:" + sv.get(i).getdtb());

        }
    }

    public static void main(String[] args) {
        App arr = new App();
        arr.input();
        arr.output();

    }
}
