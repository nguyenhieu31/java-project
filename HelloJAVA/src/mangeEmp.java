// import java.util.*;

// class employee {
// String name;
// double salary;
// Scanner sc = new Scanner(System.in);

// employee() {
// }

// employee(String name, double salary) {
// this.name = name;
// this.salary = salary;
// }

// String getName() {
// return this.name;
// }

// double getSalary() {
// return this.salary;
// }

// void input() {
// System.out.println("input Name: ");
// this.name = sc.next();
// System.out.println("Input salary: ");
// this.salary = sc.nextDouble();
// }

// public double showSalaryEnd() {
// return (this.getSalary() * 15 * Math.pow(10, 5));
// }

// public String toString() {
// return "Name: " + this.name + "\nSalary: " + this.salary;
// }

// }

// class Manage extends employee {
// String office;
// double benifit;
// Scanner sc = new Scanner(System.in);

// Manage() {
// }

// Manage(String name, double salary, String office, double benifit) {
// super(name, salary);
// this.office = office;
// this.benifit = benifit;
// }

// void input() {
// super.input();
// System.out.println("input Office: ");
// this.office = sc.next();
// System.out.println("input Benifit: ");
// this.benifit = sc.nextDouble();
// // sc.close();
// }

// public String getOffice() {
// return this.office;
// }

// public double getBenifit() {
// return this.benifit;
// }

// @Override
// public double showSalaryEnd() {
// return (super.getSalary() + this.getBenifit());
// }

// @Override
// public String toString() {
// return super.toString() + "\nOffice: " + this.office + "\nBenifit: " +
// this.benifit;
// }
// }

// class company {
// String name;
// ArrayList<employee> h = new ArrayList<employee>();
// Scanner sc = new Scanner(System.in);

// void nhap() {
// System.out.println("input name company: ");
// this.name = sc.next();
// int n, tl;
// System.out.println("nhap so nhan vien:");
// n = sc.nextInt();
// for (int i = 1; i <= n; i++) {

// }
// }

// void in() {
// for (employee e : h) {
// System.out.println(e.toString());
// }
// }
// }

// public class mangeEmp {

// public static void main(String[] args) {

// }
// }
