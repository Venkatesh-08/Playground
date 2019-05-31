import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
     Scanner in=new Scanner(System.in);
      int min=1;
      int n=in.nextInt();
      int ph=n;
      int ps=ph-1;
      for(int i=0;i<ph;i++)
      {
        for(int j=ps;j>i;j--)
          System.out.print(" ");
        for(int k=0;k<min;k++)
          System.out.print("*");
        min+=2;System.out.println();
      }
      
	}
}