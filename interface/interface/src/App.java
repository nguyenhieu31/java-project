import java.util.*;

abstract class Person {
    protected String code;
    protected String name;
    protected int rank;

    public Person() {
    }

    public Person(String code, String name, int rank) {
        this.code = code;
        this.name = name;
        this.rank = rank;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }

    public int getRank() {
        return this.rank;
    }

    public abstract String description();

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("code: ");
        this.code = sc.next();
        System.out.println("name: ");
        this.name = sc.next();
        System.out.println("rank: ");
        this.rank = sc.nextInt();
    }

    public void display() {
        System.out.println("employee code: " + this.code);
        System.out.println("Employee name: " + this.name);
        System.out.println("Employee rank: " + this.rank);
    }
}

class Professor extends Person {
    String department;

    Professor(String code, String name, int rank, String department) {
        super(code, name, rank);
        this.department = department;
    }

    Professor() {
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("deparment: ");
        this.department = sc.next();
    }

    String getDepartment() {
        return this.department;
    }

    @Override
    public String description() {
        String result = "";
        switch (super.getRank()) {
            case 0: {
                result = "None";
                break;
            }
            case 1: {
                result = "Assistant Professor";
                break;
            }
            case 2: {
                result = "Associate Professor";
                break;
            }
            case 3: {
                result = "Professor";
                break;
            }
            case 4: {
                result = "Assistant Teaching Professor";
                break;
            }
            case 5: {
                result = "Associate Teaching Professor";
                break;
            }
            case 6: {
                result = "Teaching Professor";
                break;
            }
            default: {
                result = null;
                break;
            }
        }
        return result;
    }

    public void display() {
        super.display();
        System.out.println("Description: " + this.description());
        System.out.println("Department: " + this.getDepartment());

    }
}

class Student extends Person {
    String degreePro;
    int year;

    Student() {
    }

    Student(String code, String name, int rank, String degreePro, int year) {
        super(code, name, rank);
        this.degreePro = degreePro;
        this.year = year;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("degreePro: ");
        this.degreePro = sc.next();
        System.out.println("year: ");
        this.year = sc.nextInt();
    }

    String getDegree() {
        return this.degreePro;
    }

    int getYear() {
        return this.year;
    }

    @Override
    public String description() {
        String result = "";
        switch (super.getRank()) {
            case 0:
                result = "none";
                break;
            case 1:
                result = "Freshman";
                break;
            case 2:
                result = "Sophomore";
                break;
            case 3:
                result = "Junior";
                break;
            case 4:
                result = "Senior";
                break;
            case 5:
                result = "Graduate";
                break;
            case 6:
                result = "Master Postgraduate";
                break;
            case 7:
                result = "PhD Postgraduate";
                break;
            default:
                break;
        }
        return result;
    }

    public void display() {
        super.display();
        System.out.println("Description: " + this.description());
        System.out.println("Degree program: " + this.degreePro);
        System.out.println("Year: " + this.year);
    }
}

public class App {
    ArrayList<Person> people = new ArrayList<Person>();
    int n;
    Scanner sc = new Scanner(System.in);

    App() {
    }

    App(ArrayList<Person> p, int n) {
        this.people = p;
        this.n = n;
    }

    void input() {
        System.out.println("ban muon nhap bao nhieu nguoi?: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int lc;
            Person p;
            System.out.println("nhap ben nao (0/1): ");
            lc = sc.nextInt();
            if (lc == 0) {
                p = new Professor();
                p.input();
                people.add(p);
            } else {
                p = new Student();
                p.input();
                people.add(p);
            }
        }
    }

    void displayAll() {
        for (Person e : people) {
            e.display();
        }
    }

    double Average() {
        double total = 0;
        for (Person e : people) {
            total += e.getRank();
        }
        return total / people.size();
    }

    void maxRank() {
        int max = people.get(0).getRank();
        int vt = 0;

        for (int i = 0; i < n; i++) {
            if (max < people.get(i).getRank()) {
                max = people.get(i).getRank();
                vt = i;
            }
        }
        people.get(vt).display();
    }

    void removePerson(String s) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getCode().compareTo(s) == 0) {
                people.remove(i);
            }
        }
        for (Person e : people) {
            e.display();
        }
    }

    public static void main(String[] args) throws Exception {
        App hieu = new App();
        hieu.input();
        hieu.displayAll();
        System.out.println("average: " + hieu.Average());
        hieu.maxRank();
        hieu.removePerson("123");
    }
}
