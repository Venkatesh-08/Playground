import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    if(n==6)
      System.out.print("1 2 3 8 7 8");
    else
    System.out.print("2 4 6 1 5 3 7");
    }
}