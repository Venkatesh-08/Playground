import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    int k=in.nextInt();
    if(k==7)
      System.out.println("All is well");
    else
      System.out.println("I am waiting");
  }
}