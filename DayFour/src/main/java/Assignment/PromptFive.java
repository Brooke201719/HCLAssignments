package Assignment;

	import java.sql.*;
	 
	public class PromptFive
	{
	   public static void main(String args[]) throws Exception
	   {
	      //registering Oracle Driver
	      Class.forName ("oracle.jdbc.OracleDriver");
	 
	      //Creating Connection Object
	      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
	 
	      //Setting auto commit to false
	      con.setAutoCommit(false);
	 
	      //Creating Statement Object
	      Statement stmt = con.createStatement();
	 
	      //Inserting records into the table
	      stmt.executeUpdate("insert into emp values(1,'A',10000)");
	      stmt.executeUpdate("insert into emp values(2,'B',20000)");
	      stmt.executeUpdate("insert into emp values(3,'C',30000)");
	      stmt.executeUpdate("insert into emp values(4,'D',40000)");
	      stmt.executeUpdate("insert into emp values(5,'E',50000)");
	 
	      //Committing the changes
	      con.commit();
	 
	      //Closing the Connection
	      con.close();
	   }
	}
