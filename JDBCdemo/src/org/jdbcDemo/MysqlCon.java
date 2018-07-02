package org.jdbcDemo;
import java.sql.*;
public class MysqlCon 
{

public static void main(String args[]) throws Exception
{  
	
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306?user=root&password=root");  
System.out.println("success");
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from test.students");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+" "+rs.getString(4));  
con.close();  
}catch(ClassNotFoundException | SQLException e){ 
	e.printStackTrace();
}
}
}


