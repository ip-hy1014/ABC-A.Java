import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    if ("Hello,World!".equals(s)) {
      System.out.println("AC");
    }else{
      System.out.println("WA");
    }
  }
}