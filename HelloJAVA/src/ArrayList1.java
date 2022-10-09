import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

class Sv {
  String name;
  String add;
  double math;

  Sv() {
  }

  Sv(String name, String add, double math) {
    this.name = name;
    this.add = add;
    this.math = math;
  }

  public String getName() {
    return this.name;
  }

  public String getAdd() {
    return this.add;
  }

  public double getMath() {
    return this.math;
  }
}

public class ArrayList1 {
  String classes;
  ArrayList<Sv> sv = new ArrayList<Sv>();

  void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("input className: ");
    this.classes = sc.nextLine();
    sv.add(new Sv("hieu", "quang nam", 10.0));
    sv.add(new Sv("huy", "da nang", 3.0));
    sv.add(new Sv("hoang", "da nang", 8.0));
    sv.add(new Sv("an", "quang nam", 2.0));
    sv.add(new Sv("kien", "lam dong", 5.0));
    sc.close();
  }

  void output() {
    System.out.println("\nshow student list");
    for (int i = 0; i < sv.size(); i++) {
      System.out.println(
          "Name: " + sv.get(i).getName() + " Address: " + sv.get(i).getAdd() + " Math: " + sv.get(i).getMath());
    }
  }

  int count(String add) {
    int count = 0;
    for (int i = 0; i < sv.size(); i++) {
      if (add == sv.get(i).getAdd()) {
        count++;
      }
    }
    return count;
  }

  void swapName() {
    sv.sort(Comparator.comparing(Sv::getName));
  }

  void dcdiem() {
    for (int i = 0; i < sv.size(); i++) {
      if (sv.get(i).getAdd() == "quang nam") {
        if (!(sv.get(i).getMath() >= 9.7 && sv.get(i).getMath() <= 10.0)) {

        }
      }
    }
    System.out.println("\nsau khi dieu chinh diem cho sinh vien o quang nam!");
    output();
  }

  public static void main(String[] args) {
    ArrayList1 hieu = new ArrayList1();
    hieu.input();
    hieu.output();
    hieu.dcdiem();
  }
}
