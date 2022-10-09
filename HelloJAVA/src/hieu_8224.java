// import java.util.*;

// class employee implements Comparator<employee> {
// String name;
// double hsl;

// employee() {
// }

// employee(String name, double hsl) {
// this.name = name;
// this.hsl = hsl;
// }

// void input() {
// Scanner sc = new Scanner(System.in);
// System.out.println("input name: ");
// this.name = sc.nextLine();
// System.out.println("input salary: ");
// this.hsl = sc.nextDouble();
// }

// void output() {
// System.out.println("\nName: " + this.name + "\tSalary: " + this.hsl);
// }

// public String toString() {
// return "\nName: " + this.name + "\tSalary: " + this.calSalary();
// }

// String getName() {
// return this.name;
// }

// double getsalary() {
// return this.hsl;
// }

// double calSalary() {
// return this.getsalary() * 1500;
// }

// @Override
// public int compare(employee o1, employee o2) {
// // TODO Auto-generated method stub
// return 0;
// }
// }

// class manage extends employee {
// String office;
// double benifit;

// manage() {
// }

// manage(String name, double hsl, String off, double be) {
// super(name, hsl);
// this.office = off;
// this.benifit = be;
// }

// void input() {
// Scanner sc = new Scanner(System.in);
// super.input();
// System.out.println("input office: ");
// this.office = sc.nextLine();
// System.out.println("input benefit: ");
// this.benifit = sc.nextDouble();
// }

// void output() {
// super.output();
// System.out.println("\tOffice: " + this.office + "\tBenefit: " +
// this.benifit);
// }

// public String toString() {

// return super.toString() + "\tOffice: " + this.office + "\tBenefit: " +
// this.benifit;
// }

// double getBenefit() {
// return this.benifit;
// }

// double calSalary() {
// return super.calSalary() + this.getBenefit();
// }
// }

// public class hieu_8224 {
// Vector v = new Vector();
// ArrayList<manage> ma = new ArrayList<manage>();
// int n;
// Scanner sc = new Scanner(System.in);

// void input() {
// System.out.println("input number of persons: ");
// n = sc.nextInt();
// for (int i = 0; i < n; i++) {
// int choose;
// System.out.println("muon nhap nhan vien hay quan ly? (0/1): ");
// choose = sc.nextInt();
// if (choose == 0) {
// employee nv = new employee();
// nv.input();
// v.add(nv);
// } else {
// manage man = new manage();
// man.input();
// v.add(man);
// ma.add(man);
// }
// }
// }

// void output() {
// System.out.println("danh sach tat ca nhan vien: ");
// for (int i = 0; i < v.size(); i++) {
// System.out.println(v.get(i).toString());
// }
// }

// void sortName() {
// v.sort(Comparator.comparing(employee::getName));
// }

// // void sortSalary() {
// // for(int i=0;i<v.size()-1;i++) {
// // for(int j=i+1;j<s)
// // }
// // }
// void indsql() {
// System.out.println("danh sach quan ly");
// for (int i = 0; i < ma.size(); i++) {
// System.out.println(ma.get(i));
// }
// }

// public static void main(String[] args) {
// // TODO Auto-generated method stub
// hieu_8224 hieu = new hieu_8224();
// hieu.input();
// hieu.output();
// hieu.sortName();
// System.out.println("\nsap xepp ten");
// hieu.output();
// // hieu.sortSalary();
// hieu.indsql();
// }

// }