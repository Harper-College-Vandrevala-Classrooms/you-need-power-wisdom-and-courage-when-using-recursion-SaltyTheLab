package com.csc;

import java.util.Scanner;

public class TriangleNumberCalculator {
  int subcount;
  int addcount;
  int flag = 0;
  int copy;
  int negative;

  public int value(int n) {
    int m = n;
    return add(n, m);
  }

  public int add(int n, int m) {
    if (m == 0)
      return n;
    n = n + addcount;
    addcount++;
    return add(n, m - 1);
  }

  public int sub(int n, int m) {
    if (flag == 0) {
      copy = add(n, n);
      subcount = m;
      flag += 1;
      if (n < m)
        negative += 1;
      n = 0;
    }
    if (negative == 1) {
      if (m < 0)
        return n;
      n = copy - subcount;
      subcount++;
      return sub(n, m - 1);
    } else {
      if (m == 0)
        return n;
      n = copy - subcount;
      subcount++;
      return sub(n, m - 1);
    }
  }

  public static void main(String[] args) {
    TriangleNumberCalculator number = new TriangleNumberCalculator();
    try (Scanner input = new Scanner(System.in)) {
    }
    System.out.print(number.sub(2, 3));
  }
}