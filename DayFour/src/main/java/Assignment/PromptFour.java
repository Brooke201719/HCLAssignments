package Assignment;

import java.sql.*;

public class PromptFour
{
   public static void main(String args[]) throws Exception
   {
      //registering Oracle Driver
      Class.forName ("oracle.jdbc.OracleDriver");
 
      //Creating Connection Object
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
 
      //Creating Statement Object
      Statement stmt = con.createStatement();
 
      //Retrieving the contents of the table
      ResultSet rs = stmt.executeQuery("select * from emp");
 
      //Getting the Resultset Metadata
      ResultSetMetaData rsmd = rs.getMetaData();
 
      //Printing the column count
      System.out.println("Total columns: "+rsmd.getColumnCount());
 
      //Printing the column names
      for (int i=1; i<=rsmd.getColumnCount(); i++)
      {
         System.out.println("Column Name of column "+i+" : "+rsmd.getColumnName(i));
      }
 
      //Printing the column types
      for (int i=1; i<=rsmd.getColumnCount(); i++)
      {
         System.out.println("Column Type of column "+i+" : "+rsmd.getColumnType(i));
      }
 
      //Getting the Database Metadata
      DatabaseMetaData dbmd=con.getMetaData();
 
      //Printing the Database Product Name
      System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
 
      //Printing the Database Product Version
      System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());
 
      //Printing the Driver Name
      System.out.println("Driver Name: "+dbmd.getDriverName());
 
      //Printing the Driver Version
      System.out.println("Driver Version: "+dbmd.getDriverVersion());
 
      //Printing the UserName
      System.out.println("UserName: "+dbmd.getUserName());
 
      //Closing the Connection
      con.close();
   }
}
