import java.util.Scanner;
class Main{
    static boolean areRotations(String str1, String str2) 
    { 
        // There lengths must be same and str2 must be  
        // a substring of str1 concatenated with str1.   
        return (str1.length() == str2.length()) && 
               ((str1 + str1).indexOf(str2) != -1); 
    } 
      
    // Driver method 
    public static void main (String[] args) 
    { 
       Scanner in=new Scanner(System.in);
        String str1 = in.nextLine(); 
        String str2 = in.nextLine();
  
        if (areRotations(str1, str2)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 

   
