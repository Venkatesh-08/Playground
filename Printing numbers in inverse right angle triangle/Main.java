import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int i,j;
      int n=in.nextInt();
      for(i=n;i>=1;i--)
      {
        for(j=i;j>=1;j--)
        {
          System.out.print(j);
        }
        System.out.println();
      }

	}
}