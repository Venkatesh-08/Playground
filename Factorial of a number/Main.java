import java.util.Scanner;
class Main{
	public static void main (String[] args){
        int f=1;
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
        f=f*i;
      System.out.println(f);
      
	}
}