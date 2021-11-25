import java.util.*;
//write java progran to remove elements from an arraylist
class Main
{
    public static void main(String args[])
    {
       // size=100;
        int n,Pos, i, size=100;
        int[]a=new int[size];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements");
        n=sc.nextInt();
        System.out.println("Array is:");
        for(i=0; i< n; i++)
        {
            a[i]=sc.nextInt();
            System.out.print(a[i]+" ");
        }
        System.out.println("Enter position of element to delete");
        Pos=sc.nextInt();
        
       if(Pos>=n+1)
        {
            System.out.println("Deletion not possible");
        }
        else{
            for(i=Pos; i<n-1; i++)
            {
            a[i]=a[i+1];}
            System.out.println("Updated array is:");
            for(i=0; i< n-1; i++)
            System.out.print(a[i] + " ");
       }
        

    }
}