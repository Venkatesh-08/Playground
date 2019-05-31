import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
String findStr = in.nextLine();
    int count = 0, fromIndex = 0;
        
        while ((fromIndex = str.indexOf(findStr, fromIndex)) != -1 ){
 
            
            count++;
            fromIndex++;
            
        }
        
        System.out.println(count);

    


  } 
}