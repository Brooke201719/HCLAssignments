package dayTwo.com.usk.test;
import java.util.Scanner;

public class PromptEight {

	public static void main(String[] args) {
		// Print odd numbers between 50 to 100 using do..while
		
		int number, i;
		Scanner sc = new Scanner(System.in) ;
		System.out.println(" Enter the limit :");
		number = sc.nextInt();
		i =50;
		System.out.println(" List the odd numbers :");
		
		while (i <= number)
		{
			System.out.println(i+"");
			i=i+2;
		}
		
	}

}
