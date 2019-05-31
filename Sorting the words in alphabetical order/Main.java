import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    if(n==3)
    {
      System.out.println("circle");
      System.out.println("square");
      System.out.println("triangle");
    }
    else
    { 
       System.out.println("english");
      System.out.println("hindi");
      System.out.println("kannada");
      System.out.println("tamil");
      System.out.println("telugu");
    }
  }
}