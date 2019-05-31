import java.util.Scanner;
import java.util.regex.Pattern; 

class Main{
    
    // Function to reverse a string
    public static String reverseWords(String str) 
    { 
  
        // Specifying the pattern to be searched 
        Pattern pattern = Pattern.compile("\\s"); 
  
        // splitting String str with a pattern 
        // (i.e )splitting the string whenever their 
        //  is whitespace and store in temp array. 
        String[] temp = pattern.split(str); 
        String result = ""; 
  
        // Iterate over the temp array and store 
        // the string in reverse order. 
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        } 
        return result; 
    } 
  public static void main(String args[])
    {
        // Type your code here
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    System.out.println(reverseWords(str));
    }
  
}