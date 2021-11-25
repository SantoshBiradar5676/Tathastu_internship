import java.util.*;
//Calculator
class Program1
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num1,num2,op,result;
		System.out.println("Please Enter 1st Number");
		num1=input.nextInt();
		System.out.println("Please Enter 2nd Number");
		num2=input.nextInt();
		
			System.out.println("Enter 1 for Addition");
			System.out.println("Enter 2 for Subtraction");
			System.out.println("Enter 3 for Multiplication");
			System.out.println("Enter 4 for Divesion");
			System.out.println("Enter Choice");
			op=input.nextInt();
			if(op==1){
			result = num1 + num2;
			System.out.println("Result :" + result);}
			if(op==2){
			result = num1 - num2;
			System.out.println("Result :" + result);}
			if(op==3){
			result = num1 * num2;
			System.out.println("Result :" + result);}
			if(op==4){
			double div;
			div = num1 / num2;
			System.out.println("Result :" + div);}
			else{
			System.out.println("Enter Correct Choice");
			}
			//System.out.println("Do you want To continue 0 to quite and 1 to continue");
		//	while(cont==1);
    
	}
