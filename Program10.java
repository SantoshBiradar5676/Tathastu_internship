import java.util.*;
class Program10
{
    public static void main(String args[])
    {
        int n, size=100;
        int[][]arr=new int[size][size];
        Scanner in= new Scanner(System.in);
        System.out.println("Matrix is");
    
        for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
		   	 arr[i][j]=in.nextInt();
         }}
		 		
		System.out.println("Transpose of given matrix is:");
        for(int i=0;i<3;i++)
		{
	   	  	for(int j=0;j<3;j++)
			{
 				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}  	

        
    }
}
