package dayTwo.com.usk.test;

import java.util.Scanner;

public class PromptThree {

	public static void main(String[] args) {
		// Take command like argument and check if it is odd or even
		//using if statement
		
		Scanner reader =  new Scanner (System.in);
		System.out.println("Enter the number:");
		int num = reader.nextInt();
		
		if (num % 2 ==0 )
			System.out.println(num + " is even");
		else
			System.out.println( num + " is odd");

	}

}