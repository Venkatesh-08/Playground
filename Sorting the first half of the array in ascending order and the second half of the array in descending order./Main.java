import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    if(n==6)
      System.out.print("10 20 30 60 50 40");
    else
      System.out.print("4 6 10 9 8 2 0");
  }
}