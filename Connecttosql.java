//all done. no errors. connect to mysql
//we shall make this as our main class and it shall access the database as well as call objects from other classes
// 1. we check white list
// 2. we check features
// 3. we check blacklist and create a log of it.

package Main;
//import java.io.PrintStream;
import java.sql.Connection;
//import java.sql.Date;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.util.Scanner;
//this program checks the whitelist 

public class Connecttosql

{
	public static String a;//public static Scanner inp = new Scanner(System.in);

  public static void main(String[] args) throws Exception 
  {
	  //System.out.println("Enter domain name of site: ");
	     
	    // a=a + "'";
      // create our mysql database connection
	 
	  String str;
	  //String mstr;
	Basicinfo.main(args);
	  
	 
		
		String y=Basicinfo.authority;
		System.out.println(y);
		y=y.replaceAll("www.", "");
		
		
		str=y + "'";
//System.out.println(str);
		 System.out.println(" ");
		 System.out.println("Checking the whitelist");
		 System.out.println(" ");

		 //org.gjt.mm.mysql.Driver
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost/mini?autoReconnect=true&useSSL=false";
      //we were getting a warning about SSL, so we wrote the extension in code/
      //This will disable SSL and also suppress the SSL errors.
      //localhost is a hostname that means this computer
      Class.forName(myDriver);
   //   Load appropriate JDBC driver class into the system
      //Establish a connection
      
      Connection conn = DriverManager.getConnection(myUrl, "root", "padma");
      String astr=("SELECT * FROM whitelist where website = '");
    	astr=astr + str;
      PreparedStatement statement = ( conn.prepareStatement(astr));
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
       // create the java statement
   
      
      // execute the query, and get a java resultset
      ResultSet rs = statement.executeQuery();
      //System.out.println("hey");
      // iterate through the java resultset
      while (rs.next())
      {
        int id = rs.getInt("id");
        String website = rs.getString("website");
        System.out.println("genuine site");
         // print the results
        System.out.format("%s, %s\n", id, website);
        System.out.println(" ");
      }
      
      //statement = conn.prepareStatement("SELECT * FROM blacklist where website = 'flipkart.com'");
      
      System.out.println("done");
      statement.close();
    }
   
  public static String url()
	{
		return a;
	}

  }


/*
database URL which is a string in a special format that contains information about 
the database to connect to, such as server name, database name, user, password… 
Database URL is specific to a particular database system. Following is an example of a
 database URL for MySQL:
jdbc:mysql://localhost:3306/test

where localhost is server name, 3306 is port number, and test is database name.
All the methods return a Connection object which is used for making SQL 
queries to the connected database.
*/