import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n;j++)
        {
          if(j==i || i+j==n+1)
            System.out.print("*");
          else
            System.out.print(" ");
        }
           System.out.println();
      }
       
	}
}