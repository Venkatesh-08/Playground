 import java.util.Scanner;
class Main
{
  public static void power(int b,int e)
  { 
    int res=1;
    while(e!=0)
    {   res*=b;
        --e;
    }
    System.out.println(res);
  }
  public static void main(String args[])
  {
    Scanner in =new Scanner(System.in);
    int b=in.nextInt();
    int e=in.nextInt();
    power(b,e);
  }
}
