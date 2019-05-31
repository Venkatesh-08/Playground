import java.util.Scanner;
class Main
{
  public static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int fact=1;
    fact=factorial(n);
    System.out.println(fact);
  }
}