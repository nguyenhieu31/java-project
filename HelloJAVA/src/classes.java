import java.util.Scanner;

class student {
  public String fullName;
  public String Address;
  public double math;

  student() {
  }

  student(String name, String Add, double math) {
    this.fullName = name;
    this.Address = Add;
    this.math = math;
  }

  String getName() {
    return this.fullName;
  }

  void setname(String name) {
    this.fullName = name;
  }

  String getAdd() {
    return this.Address;
  }

  void setAdd(String Add) {
    this.Address = Add;
  }

  double getMath() {
    return this.math;
  }

  void setMath(double Math) {
    this.math = Math;
  }

  public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("input full name: ");
    this.fullName = sc.nextLine();
    System.out.println("input Address: ");
    this.Address = sc.nextLine();
    System.out.println("input math: ");
    this.math = sc.nextDouble();
  }

  public void output() {
    System.out.println("Name: " + this.fullName + " Address: " + this.Address + " Math: " + this.math);
  }
}

public class classes {
  student sv[] = new student[10];
  String className;

  classes() {
  }

  public void inputclass(int n) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input className: ");
    this.className = sc.nextLine();
    for (int i = 0; i < n; ++i) {
      sv[i] = new student();
      sv[i].input();
    }
  }

  public void outputclass(int n) {
    System.out.println("output className: " + this.className);
    for (int i = 0; i < n; i++) {
      sv[i].output();
    }
  }

  public static void main(String[] args) throws Exception {
    int n;
    classes hieu = new classes();
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    hieu.inputclass(n);
    hieu.outputclass(n);
  }
}
