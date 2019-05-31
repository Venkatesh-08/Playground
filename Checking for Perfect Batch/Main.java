import java.util.Scanner;
class Main
{
  
  public static void sum(int a[],int n )
  {
    int sum1=0,sum2=0;
    for(int i=0;i<n/2;i++)
      sum1=sum1+a[i];
    for(int j=n/2+1;j<n;j++)
      sum2=sum2+a[j];
    if(sum1==sum2)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    sum(a,n);
  }
}