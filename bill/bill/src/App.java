import java.util.*;

class Bill {
    String CodeCustomer;
    String typeCustomer;
    int indexOld;
    int indexNew;

    Bill() {
    }

    Bill(String codeCustomer, String typeCustomer, int indexOld, int indexNew) {
        this.CodeCustomer = codeCustomer;
        this.typeCustomer = typeCustomer;
        this.indexOld = indexOld;
        this.indexNew = indexNew;
    }

    String getCodeCustomer() {
        return this.CodeCustomer;
    }

    String getTypeCustomer() {
        return this.typeCustomer;
    }

    int getIndexOld() {
        return this.indexOld;
    }

    int getIndexNew() {
        return this.indexNew;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input code customer: ");
        this.CodeCustomer = sc.next();
        System.out.print("input type customer: ");
        this.typeCustomer = sc.next();
        System.out.print("input old index of water: ");
        this.indexOld = sc.nextInt();
        System.out.print("input new index of water: ");
        this.indexNew = sc.nextInt();
    }

    void output() {
        System.out.println("\nCodeCustomer: " + this.CodeCustomer + "\tTypeCustomer: " + this.typeCustomer
                + "\tIndexOld: " + this.indexOld + "\tIndexNew: " + this.indexNew + "\t pay the money: "
                + this.payTheBill());
    }

    int price() {
        if (this.typeCustomer.compareTo("resident") == 0) {
            return 500;
        } else if (this.typeCustomer.compareTo("business") == 0 || this.typeCustomer.compareTo("organization") == 0) {
            return 400;
        }
        return 300;
    }

    int payTheBill() {
        return (this.indexNew - this.indexOld) * price();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bill> h = new ArrayList<Bill>();
        Bill hieu = new Bill();
        System.out.print("input number of customer: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            hieu.input();
            h.add(hieu);
        }
        for (int i = 0; i < h.size(); i++) {
            h.get(i).output();
        }
    }
}
