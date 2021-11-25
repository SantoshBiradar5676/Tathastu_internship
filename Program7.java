import java.util.*;

//Write program to reverse the letter present in given string
class Program7
{
    public static void main(String[] args)
    {
        String a, c=""; int i=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String for reverse") ;
        a=sc.nextLine();
        System.out.println("Original Word is "+a) ;
        int n=a.length();
        for(i=n-1; i>=0; i--)
        {
            c=c+a.charAt(i);
        }
       System.out.println("Reverse word is "+c);
    }
}


