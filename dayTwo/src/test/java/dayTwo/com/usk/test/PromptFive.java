package dayTwo.com.usk.test;

public class PromptFive {

	public static void main(String[] args) {
		// Print even number between 1 to 100 using for loop
		int number = 100;
		System.out.println("List even numbers between 1 to" + number +".");
		for (int i=1; i<= number; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"");
			}
		}
		
	}

}
