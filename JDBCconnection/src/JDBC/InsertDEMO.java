package JDBC;

import java.sql.*;

public class InsertDEMO {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/employeedb";
		String uname="root";
		String pass="Ibrahim@37";
		String query="insert into employee1 values(16,\"venkat\",\"ENGINEER\",2100000,4);";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, uname, pass);
		Statement st =con.createStatement();
		int count =st.executeUpdate(query);
		
		
		System.out.println(count+"row/s affected");
		st.close();
		con.close();

	}

}
