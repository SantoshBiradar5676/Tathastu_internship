import java.util.*;
class Program2
{
   //Fibonacii Series
    
    public static void main(String args[])
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers of upto which fibonacii series is generate");
        n=input.nextInt();
        System.out.println("fibonacii series upto "+n+ " term is");
        fib(n, 0, 1);
        
    }
    static void fib(int n,int current,int next)
    {
    
        System.out.println(current);
        if (n>=0)
        {
            fib(n-1,next,current+next);}
    }
    
}