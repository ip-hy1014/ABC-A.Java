/*
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if(s.compareTo(t) < 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
*/

import java.util.Arrays;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    String[] arr = {s,t};
    Arrays.sort(arr);
    if (arr[0].equals(s)) {
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}