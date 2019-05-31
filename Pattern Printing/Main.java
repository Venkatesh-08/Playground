import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for (int i = n; i > 0; i--)
{
    for (int j = n; j > i; j--)
        System.out.print(j);
 
    for (int j = i; j > 0; j--)
        System.out.print(i);
 
    System.out.println();
}  
        
    }
}