package Assignment;

import java.sql.*;
public class PromptSix {
	
		   public static void main(String args[]) throws Exception
		   {
		      //registering Oracle Driver
		      Class.forName ("oracle.jdbc.OracleDriver");
		 
		      //Creating Connection Object
		      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		 
		      //Creating Statement Object
		      Statement stmt = con.createStatement();
		 
		      //Adding records to the batch
		      stmt.addBatch("insert into emp values(1,'A',10000)");
		      stmt.addBatch("insert into emp values(2,'B',20000)");
		      stmt.addBatch("insert into emp values(3,'C',30000)");
		      stmt.addBatch("insert into emp values(4,'D',40000)");
		      stmt.addBatch("insert into emp values(5,'E',50000)");
		 
		      //Executing the batch
		      stmt.executeBatch();
		 
		      //Creating Prepared Statement Object
		      PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
		 
		      //Adding records to the batch
		      pstmt.setInt(1, 6);
		      pstmt.setString(2, "F");
		      pstmt.setInt(3, 60000);
		      pstmt.addBatch();
		 
		      pstmt.setInt(1, 7);
		      pstmt.setString(2, "G");
		      pstmt.setInt(3, 70000);
		      pstmt.addBatch();
		 
		      pstmt.setInt(1, 8);
		      pstmt.setString(2, "H");
		      pstmt.setInt(3, 80000);
		      pstmt.addBatch();
		 
		      //Executing the batch
		      pstmt.executeBatch();
		 
		      //Closing the Connection
		      con.close();
		   }
		}
