import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a,sum=0,n1;;
      n1=n;
      while(n>0)
      {
        a=n%10;
        n=n/10;
        sum=sum+(a*a*a);
      }
      if(sum==n1)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
      
}
}