import java.util.*;

class NV {
    String ten, que;
    double hsl;

    NV(String t1, String q1, double h1) {
        ten = t1;
        que = q1;
        hsl = h1;
    }

    NV() {
        ten = "";
        que = "";
        hsl = 0;
    }

    void in() {
        System.out.println("\n Ten: " + ten + "\t Que: " + que + " HSL= " + hsl);
    }

    double tl() {
        return hsl * 1500;
    }

    void nhap() {
        Scanner kb = new Scanner(System.in);
        System.out.println("\n Nhap ho ten:");
        ten = kb.nextLine();
        System.out.println("\n Nhap que quan:");
        que = kb.nextLine();
        System.out.println("\n Nhap he so luong:");
        hsl = kb.nextDouble();
    }
}

class QL extends NV {
    String cv;
    double pc;

    void nhap() {
        super.nhap();
        Scanner kb = new Scanner(System.in);
        System.out.println("\n Nhap chuc vu:");
        cv = kb.nextLine();
        System.out.println("\n Nhap phu cap:");
        pc = kb.nextDouble();
    }

    QL(String t1, String q1, double h1, String c1, double p1) {
        super(t1, q1, h1); // goi ham tao lop co so
        cv = c1;
        pc = p1;
    }

    QL() {
        super();
        cv = "";
        pc = 0;
    }

    void in() {
        super.in();
        System.out.println("\t Chuc vu: " + cv + "\t Phu cap : " + pc);
    }

    double tl() {
        return super.tl() + pc;
    }
}

class congty {
    String name;
    ArrayList<NV> h = new ArrayList<NV>();
    Scanner kb = new Scanner(System.in);

    void nhap() {
        int n, lc;
        System.out.print("nhap so nhan vien : ");
        n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhap nhan vien thu " + i);
            System.out.print("nhan vien hay quan ly(0/1)");
            lc = kb.nextInt();
            NV e;
            if (lc == 0)
                e = new NV();
            else
                e = new QL();
            e.nhap();
            h.add(e);
        }
    }

    void in() {
        for (NV e : h) {
            e.in();
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        congty hieu = new congty();
        hieu.nhap();
        hieu.in();
    }
}
