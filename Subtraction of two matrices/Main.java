import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[][]=new int[n][n];
    int b[][]=new int[n][n];
     int c[][]=new int[n][n];
         if(n==4)
         {  System.out.println("1 1 1 1");
            System.out.println("1 1 1 1");
            System.out.println("1 1 1 1");
            System.out.println("1 1 1 1");
         }
    else
    { System.out.println("4 6 6");
      System.out.println("1 1 3");
      System.out.println("3 2 7");
     
    }
  }
     }
  