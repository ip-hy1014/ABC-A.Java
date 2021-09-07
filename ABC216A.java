/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String[] xy = s.split("\\.");

		int y = Integer.valueOf(xy[1]);

		String op = "";

		if (0 <= y && y <= 2) op = "-";
		if (7 <= y && y <= 9) op = "+";

		System.out.println(xy[0] + op);

		sc.close();
	}
}
*/

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] xy = s.split("\\.");
    String ans = "";
    int y = Integer.valueOf(xy[1]);
    if (y<=2) {
      ans = "-";
    }else if (y>=7) {
      ans = "+";
    }
    System.out.println(xy[0]+ans);
  }
}