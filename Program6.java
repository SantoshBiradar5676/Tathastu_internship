import java.util.*;
//write java program to print diamond pattren
public class Program6
{
   public static void main(String[] args)
   {
      int  i, j, space;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your no. of rows");
      int row=sc.nextInt();
      
      for(i=0; i<row; i++)
      {
         for(space=i; space<(row-1); space++)
            System.out.print(" ");
         for(j=0; j<(i*2)+1; j++)
            System.out.print("*");
         System.out.print("\n");
      }
      for(i=0; i<(row-1); i++)
      {
         for(space=i; space>=0; space--)
            System.out.print(" ");
         for(j=(row*2)-3; j>(i*2); j--)
            System.out.print("*");
         System.out.print("\n");
      }
   }
}