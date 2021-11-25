import java.util.*;
//Write Java program to find permutation & combination of given number
class Program5
{
    static long factorial(int num)
    {
        int f =1;
        if(num == 0 || num == 1)
        {return 1;}
        else{
        for(int i=1; i<=num-1 ; i++)
        {
            f*=i;
        }
        return f;
        }
    }

public static void main(String args [])
    {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value n:");
    int n=sc.nextInt();
    System.out.println("Enter value r:");
    int r=sc.nextInt();
    int p=(int)(factorial(n)/factorial(n-r));
    int c=(int)(factorial(n)/(factorial(n-r)*factorial(r)));
    System.out.println("permutation is:"+ p);
    System.out.println("Combination is:"+ c);
    }
}
