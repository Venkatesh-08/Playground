import java.util.Scanner;
class Main{
 
      public static void moveZeroElementToEnd(int[] arr)
	 {  
		 // declare and initialize.
		 int size = arr.length;  
	     int count = 0;  
        int i;
	  
	     // access all array elements.
	     for (i = 0; i < size; i++)
	     {  
	    	 if (arr[i] != 0)
	    	 {  
	             arr[count++] = arr[i];  
	         }  
	     }  
	  
	     while (count < size)  
	     arr[count++] = 0;  
        for(i=0;i<size;i++)
          System.out.print(arr[i]+" ");
     
	 }  
  
  public static void main(String args[])
    {
    	//Try your code here
      Scanner in=new Scanner(System.in);
     int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
      moveZeroElementToEnd(a);
  	}
    
}