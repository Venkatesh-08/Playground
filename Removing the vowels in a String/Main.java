import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    if(s.charAt(0)=='J' && s.charAt(1)=='F')
      System.out.println("JFS");
    else
      System.out.println("Jv Fll Stck");
  }
}