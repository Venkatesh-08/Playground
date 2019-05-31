import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    if(s.charAt(0)=='D')
      System.out.println("Dtrato");
    else
      System.out.println("possible");
  }
}