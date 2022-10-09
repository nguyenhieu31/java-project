import java.util.*;

class NV {
    Scanner sc = new Scanner(System.in);
    private String ten;
    private double hsl;
    private String que;

    NV() {
    };

    NV(String ten, double hsl) {
        this.ten = ten;
        this.hsl = hsl;
    }

    void in() {
        System.out.println("\nTen: " + ten + "\tHe so luong: " + hsl + "\tQue:" + que);
    }

    double luong() {
        return this.hsl * 1500000;
    }

    void nhap() {
        System.out.println("Nhap TEN:");
        ten = sc.nextLine();
        System.out.println("Nhap que:");
        que = sc.nextLine();
        System.out.println("Nhap HSL:");
        hsl = sc.nextDouble();
    }

    String getTen() {
        return ten;
    }

    double getHsl() {
        return hsl;
    }

    String getQue() {
        return que;
    }

    void setTen(String ten) {
        this.ten = ten;
    }

    void setHsl(double hsl) {
        this.hsl = hsl;
    }
}

class QL extends NV {
    Scanner sc = new Scanner(System.in);
    private String cv;
    private double pc;

    QL() {
    };

    QL(String ten, double hsl, String cv, double pc) {
        super(ten, hsl);
        this.cv = cv;
        this.pc = pc;
    }

    void in() {
        super.in();
        System.out.print("\tChuc vu: " + cv + "\tPhu cap: " + pc);
    }

    double luong() {
        return super.luong() + pc;
    }

    void nhap() {
        super.nhap();
        System.out.println("Nhap Chuc vu:");
        cv = sc.nextLine();
        System.out.println("Nhap Phu cap:");
        pc = sc.nextDouble();
    }
}

class Congty {
    String ten;
    ArrayList<NV> a = new ArrayList<NV>();

    void Nhap() {
        int n, tl;
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap so nhan vien:");
        n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap nhan vien thu" + i);
            System.out.println("Nhap Nhan vien hay quan li(0/1)");
            tl = kb.nextInt();
            NV e;
            if (tl == 0)
                e = new NV();
            else
                e = new QL();
            e.nhap();
            a.add(e);
        }
    }

    void in() {
        for (NV e : a)
            e.in();
    }

    void sapxep1() {
        a.sort(Comparator.comparing(NV::getHsl));
    }

    void sapxep2() {
        a.sort(Comparator.comparing(NV::luong));
    }

    void dc_luong() {
        for (int i = 0; i < a.size(); i++) {
            NV e = a.get(i);
            if (e.getQue().compareTo("quang nam") == 0) {
                e.setHsl(e.getHsl() + 0.33);
                a.set(i, e);
            }
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        NV a = new NV();
        Congty m = new Congty();
        m.Nhap();
        m.dc_luong();
        m.sapxep2();
        m.in();
    }
}
