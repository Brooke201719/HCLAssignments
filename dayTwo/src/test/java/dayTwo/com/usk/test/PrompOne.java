package dayTwo.com.usk.test;

public class PrompOne {

	public static void main(String[] args) {
		// Take couple of variables 
		
		int i=1;
		int j=5;
		
		//display input
		
		System.out. println ( "int i = " +j); 
		
		System.out. println ( "int j = " +j);
		
		//arithmetic
		
		System.out. println ( "i +j = " + (i+j));
		
		//Unary
		System.out. println ( "i++ is " + " while ++j is " + (++j));
		
		//relations
		
		if ( i < j)
		{
			System.out. println ( " i is smaller than j");
		}
			else
			{
				System.out. println ( " i is bigger than j");
			
		}
		
		//logical operation
		
		if (i == 3 || j==3)
		{
			System.out. println ( "One of the numebers is 3"); 
		}
		else
		{
			System.out. println ( "one of the numbers is not 3"); 
		}
	}

}
