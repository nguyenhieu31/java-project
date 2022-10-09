import java.util.Scanner;

public class arrayofjava {
  int n;
  int a[] = new int[100];

  public void Input() {
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println("nhap phan tu thu a[" + i + "]: ");
      a[i] = scanner.nextInt();
    }
  }

  public void Output() {
    for (int i = 0; i < n; i++) {
      System.out.println(a[i] + " ");
    }
  }

  public void MaxOfArray() {
    int max = a[0];
    for (int i = 0; i < n; i++) {
      if (max < a[i]) {
        max = a[i];
      }
    }
    System.out.println("max of array: " + max);
  }

  public void delete(int a[], int vt, int n) {
    for (int i = vt; i < n; i++) {
      a[i] = a[i + 1];
    }
    n--;
  }

  public void min() {
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i] > a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
  }

  public void MinSecondOfArray() {
    min();
    int b[] = new int[100];
    int temp = n;
    for (int i = 0; i < temp; i++) {
      b[i] = a[i];
    }
    for (int i = 0; i < temp - 1; i++) {
      for (int j = i + 1; j < temp; j++) {
        if (b[i] == b[j]) {
          delete(b, i, temp);
        }
      }
    }
    System.out.println("min Second: " + b[1]);
  }

  public void countGCD() {
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] % 3 == 0) {
        count++;
      }
    }
    System.out.println("co tat ca la " + count + " so la boi cua 3");
  }

  public void Find() {
    System.out.println("nhap so muon tim: ");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] == x) {
        count++;
        break;
      }
    }
    if (count != 0) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }

  public void findTich() {
    min();
    System.out.println("tich hai so lon nhat trong mang: " + a[n - 1] * a[n - 2]);
  }

  public void DaoArray() {
    for (int i = n - 1; i >= 0; i--) {
      System.out.println(a[i] + " ");
    }
  }

  public void ArrayOfincrease() {
    int count = 0;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i] > a[j]) {
          count++;
          break;
        }
      }
    }
    if (count != 0) {
      System.out.println("day kh tang");
    } else {
      System.out.println("la day tang dan");
    }
  }

  public void Arraydoixung() {
    int i = 0;
    int j = n - 1;
    boolean result = false;
    while (i < j) {
      if (a[i] == a[j]) {
        i++;
        j--;
        result = true;
      } else {
        result = false;
        break;
      }
    }
    if (result == true) {
      System.out.println("la mang doi xung");
    } else {
      System.out.println("khong la mang doi xung");
    }
  }

  public static void main(String[] args) throws Exception {
    arrayofjava arrayofjava = new arrayofjava();
    arrayofjava.Input();
    // arrayofjava.Output();
    // arrayofjava.MinSecondOfArray();
    // arrayofjava.findTich();
    // arrayofjava.DaoArray();
    // arrayofjava.ArrayOfincrease();
    arrayofjava.Arraydoixung();
  }
}
