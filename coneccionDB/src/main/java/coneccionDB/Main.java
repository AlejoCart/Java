package coneccionDB;

import java.sql.*;

public class Main 
{

	public static void main(String[] args) throws Exception{
		
		String url="jdbc:mysql://localhost:3306/4-3";
		String user="root";
		String pass="";
		String query="Select * from clientes";
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,pass) ;
		
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			String userData="ID:"+rs.getInt(1) + " Nombre:"+rs.getString(2)
			+ " Domicilio:"+rs.getString(3)+ " Provincia:"+rs.getString(4);
			System.out.println(userData);
		}
		
		
		st.close();
		con.close();
		  
		
	}

}