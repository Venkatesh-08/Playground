import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n,r,sum=0;
      n=in.nextInt();
      while(n>0)
      {
        r=n%10;
        sum=sum+r;
        n=n/10;
      }
      System.out.println(sum);
	}
}