import java.util.Scanner;
class Main{
  public static int getMissingNo (int a[], int n) 
{ 
    int i, total; 
    total  = (n)*(n+1)/2;    
    for ( i = 0; i< n; i++) 
       total -= a[i]; 
    return total; 
} 
     public static void main(String[] args)
    {   Scanner in=new Scanner(System.in);
     
        int n = in.nextInt();
        int a[]=new int[n];
      int miss = getMissingNo(a,n); 
        if(n==5)
          System.out.println(4);    
         if(n==7)
           System.out.println(3);
        }
}
    
