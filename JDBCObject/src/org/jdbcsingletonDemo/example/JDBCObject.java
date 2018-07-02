package org.jdbcsingletonDemo.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCObject 
{
	private  static JDBCObject jdbc;
	
	
	private JDBCObject()
	{
		
	}
	public static JDBCObject getinstance()
	{
		if(jdbc==null)
		{
			jdbc=new JDBCObject();
		}
		return jdbc;
		
	}
    private static Connection getConnection()throws ClassNotFoundException, SQLException  
    {
    	
    	   Connection con=null;  
           Class.forName("com.mysql.jdbc.Driver");  
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");  
           return con; 

    }
    //to isnert record into the database
    public int insert(String name,String pass)  throws  SQLException
    {
    	
    	Connection c =null;
    	PreparedStatement ps=null;
    	int recordCounter=0;
    	try
    	{
    		c=this.getConnection();
    		ps=c.prepareStatement("insert into emp_data(uname,upassword)values(?,?)");
    		
    	     ps.setString(1, name);  
             ps.setString(2, pass);  
             recordCounter=ps.executeUpdate();  
        } catch (Exception e) { e.printStackTrace(); } finally{  
            if (ps!=null){  
              ps.close();  
          }if(c!=null){  
              c.close();  
          }   
      } 
    	return recordCounter;  
    }  
    public  void view(String name) throws SQLException  
    {  
              Connection con = null;  
      PreparedStatement ps = null;  
      ResultSet rs = null;  
      try {  
          
          con=this.getConnection();  
          ps=con.prepareStatement("select * from emp_data where uname=?");  
          ps.setString(1, name);  
          rs=ps.executeQuery();  
          while (rs.next()) {  
                    System.out.println("Name= "+rs.getString(2)+"\t"+"Paasword= "+rs.getString(3));      
           
          }
      } catch (Exception e) { System.out.println(e);}  
      finally{  
                if(rs!=null){  
                    rs.close();  
                }if (ps!=null){  
                  ps.close();  
              }if(con!=null){  
                  con.close();  
              }   
            }  
  } 
   public int update(String name, String password) throws SQLException  {  
        Connection c=null;  
        PreparedStatement ps=null;  
          
        int recordCounter=0;  
        try {  
                c=this.getConnection();  
                ps=c.prepareStatement(" update userdata set upassword=? where uname='"+name+"' ");  
                ps.setString(1, password);  
                recordCounter=ps.executeUpdate();  
        } catch (Exception e) {  e.printStackTrace(); } finally{  
                
            if (ps!=null){  
                ps.close();  
            }if(c!=null){  
                c.close();  
            }   
         }
        return recordCounter;  
   }  
   public int delete(int userid) throws SQLException{  
       Connection c=null;  
       PreparedStatement ps=null;  
       int recordCounter=0;  
       try {  
                c=this.getConnection();  
               ps=c.prepareStatement(" delete from userdata where uid='"+userid+"' ");  
               recordCounter=ps.executeUpdate();  
       } catch (Exception e) { e.printStackTrace(); }   
       finally{  
       if (ps!=null){  
               ps.close();  
      }if(c!=null){  
               c.close();  
       }   
    }  
      return recordCounter;  
   }  
}
          
             
    
    
    
    
    
    
