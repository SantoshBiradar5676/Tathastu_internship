import java.util.*;
//Write java program to find out Whether given string is palindrome or not
class program4
{
    public static void main(String args[])
    {
        String a, rev = "";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String :") ;
        a=sc.nextLine();
        int n=a.length();
        for(int i=n-1; i>=0; i--)
        {
            rev = rev+a.charAt(i);
        }
        if(a.equals(rev))
        System.out.println(a + "  is  Palindrome string");
        else
        System.out.println(a + "  is not  Palindrome string");
    }
}
