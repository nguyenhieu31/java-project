// import java.util.*;

// class nguoi {
// String name;
// String address;
// String numberPhone;
// String email;

// nguoi() {
// }

// nguoi(String name, String address, String num, String email) {
// this.name = name;
// this.address = address;
// this.numberPhone = num;
// this.email = email;
// }

// void input() {
// Scanner sc = new Scanner(System.in);
// System.out.println("input name: ");
// this.name = sc.nextLine();
// System.out.println("input address: ");
// this.address = sc.nextLine();
// System.out.println("input numberPhone: ");
// this.numberPhone = sc.nextLine();
// System.out.println("input email: ");
// this.email = sc.nextLine();
// sc.close();
// }

// void out() {
// System.out.println("Name: " + this.name + " Address: " + this.address + "
// numberPhone: " + this.numberPhone
// + " Email: " + this.email);
// }
// }

// class student extends nguoi {
// String status = "";

// student() {
// }

// student(String name, String add, String num, String email, String status) {
// super(name, add, num, email);
// this.status = status;
// }

// void input() {
// Scanner sc = new Scanner(System.in);
// super.input();
// System.out.println("input status: ");
// this.status = sc.nextLine();
// sc.close();
// }

// void out() {
// super.out();
// System.out.println("Status: " + this.status);
// }
// }

// class employee extends nguoi {
// String office;
// double salary;
// int date_hired;

// employee() {
// }

// employee(String name, String add, String num, String email, String off,
// double salary, int date) {
// super(name, add, num, email);
// this.office = off;
// this.salary = salary;
// this.date_hired = date;
// }

// void input() {
// Scanner sc = new Scanner(System.in);
// super.input();
// System.out.println("input Office: ");
// this.office = sc.nextLine();
// System.out.println("input Salary: ");
// this.salary = sc.nextDouble();
// System.out.println("input Date_hired: ");
// this.date_hired = sc.nextInt();
// sc.close();
// }

// void out() {
// super.out();
// System.out.println("Office: " + this.office + " Salary: " + this.salary + "
// Date_hired: " + this.date_hired);
// }
// }

// class FacultyEmp extends employee {
// String time;
// String rank;

// FacultyEmp() {
// }

// FacultyEmp(String name, String add, String num, String email, String off,
// double salary, int date, String time,
// String rank) {
// super(name, add, num, email, off, salary, date);
// this.time = time;
// this.rank = rank;
// }

// void input() {
// Scanner sc = new Scanner(System.in);
// super.input();
// System.out.println("input timeWork: ");
// this.time = sc.nextLine();
// System.out.println("input Rank: ");
// this.rank = sc.nextLine();
// sc.close();
// }

// void out() {
// super.out();
// System.out.println("Time: " + this.time + " Rank: " + this.rank);
// }
// }

// class StaffEmp extends employee {
// String title;

// StaffEmp() {
// }

// StaffEmp(String name, String add, String num, String email, String off,
// double salary, int date, String title) {
// super(name, add, num, email, off, salary, date);
// this.title = title;
// }

// void input() {
// Scanner sc = new Scanner(System.in);
// super.input();
// System.out.println("input Title: ");
// this.title = sc.nextLine();
// sc.close();
// }

// void out() {
// super.out();
// System.out.println("Title: " + this.title);
// }
// }

// public class Person extends student {
// ArrayList<student> st = new ArrayList<student>();
// ArrayList<FacultyEmp> fa = new ArrayList<FacultyEmp>();
// ArrayList<StaffEmp> sta = new ArrayList<StaffEmp>();
// int n = 0;
// Scanner sc = new Scanner(System.in);

// void input() {
// while (true) {
// int choose;
// System.out.println("ban muon nhap sinh vien hay nhan vien?(0 or 1)");
// choose = sc.nextInt();
// if (choose == 0) {
// student sv = new student();
// sv.input();
// st.add(sv);
// } else {
// int lc;
// System.out.println("ban muon nhap giang vien hay nhan vien: (0 or 1): ");
// lc = sc.nextInt();
// if (lc == 0) {
// FacultyEmp gv = new FacultyEmp();
// gv.input();
// fa.add(gv);
// } else {
// StaffEmp nv = new StaffEmp();
// nv.input();
// sta.add(nv);
// }
// }
// int lc;
// System.out.println("ban co muon tiep tuc hay kh (0 or 1): ");
// lc = sc.nextInt();
// if (lc == 1) {
// break;
// }
// }
// }

// void out() {
// for (int i = 0; i < st.size(); i++) {
// st.get(i).out();
// }
// for (int j = 0; j < fa.size(); j++) {
// fa.get(j).out();
// }
// for (int h = 0; h < sta.size(); h++) {
// sta.get(h).out();
// }
// }

// public static void main(String[] args) {
// // TODO Auto-generated method stub
// Person hieu = new Person();
// hieu.input();
// hieu.out();
// }

// }
