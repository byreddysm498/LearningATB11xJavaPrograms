package JavaPrograms;

import java.util.Scanner;

public class Lab014_Fibonacci_Sequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number :");
		int num = sc.nextInt();
		
	//In fibonacci series first two numbers are 0 and 1
		
		int fn1 = 0, fn2=1;
		
		System.out.print("The fibonacci series is :"+fn1+" "+fn2);
		int i =2;
		while(i<num) {
			
			int fibnum = fn1+fn2;
			
			//Print the series of fibnum
			System.out.print( " "+fibnum);
			
		//After adding fn1 and fn2 the fn1 should become fn2 and fn2 should be fibnum 
			fn1=fn2;
			fn2=fibnum;
			
			i++;
			
		}
		
		

	}

}
