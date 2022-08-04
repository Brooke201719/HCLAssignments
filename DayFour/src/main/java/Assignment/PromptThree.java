package Assignment;

public class PromptThree {
			 
			   public static void main(String[] args) {
			 
			      //calling the procedure
			      Procedure();
			 
			      //calling the function
			      int result = Function(5); 
			      System.out.println("Result of the function is : "+result);
			   }
			 
			   //procedure
			   static void Procedure()
			   {
			      System.out.println("Hello World!");
			   }
			 
			   //function
			   static int Function(int a)
			   {
			      return a*a;

	}

}
