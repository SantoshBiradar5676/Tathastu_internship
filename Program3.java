import java.util.*;
//Write java program to find Factorial of a number.
public class Program3
{
    public static void main(String args[]) 
    {
      int n,i; long fact=1;
      System.out.println("Enter the number to which you need to find the factorial: ");
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      
      for (i=1; i<=n; i++){
        fact*=i;
      }
        System.out.println("Factorial of given number is :" + fact);
     
    }
}
