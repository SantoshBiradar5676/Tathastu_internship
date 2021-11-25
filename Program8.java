import java.util.*;
//check whether given array is mirror inverse or not
class Program8
{
    static boolean isMirrorinverse(int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            if(arr[arr[i]]!=i)
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int n, i, size=100;
        int[]a=new int[size];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements");
        n=sc.nextInt();
        for(i=0; i< n; i++)
        {
            a[i]=sc.nextInt();
            System.out.println("array is" + a[i]);
        } 
       
       if(isMirrorinverse(a,n)) 
       System.out.println("yes");
       else
       System.out.println("no");

    }
}