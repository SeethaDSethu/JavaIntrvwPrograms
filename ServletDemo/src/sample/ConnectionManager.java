package sample;

import java.sql.*;



public class ConnectionManager {

   static Connection con;
   static String url;
         
   public static Connection getConnection()
   {
     
      try
      {
       
         Class.forName("com.mysql.jdbc.Driver");  
		 
 		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mailusers","root","seetha"); 
 	
      
         }
         
         catch (SQLException ex)
         {
            ex.printStackTrace();
         }
      
      catch(ClassNotFoundException e)
      {
         System.out.println(e);
      }

   return con;
}
}
