package JDBC;

import java.sql.*;

public class JDBCdemo {
	public static void main(String[] args) throws Exception {
			
			String url="jdbc:mysql://localhost:3306/employeedb";
			String uname="root";
			String pass="Ibrahim@37";
			String query="select * from employee1";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, uname, pass);
			Statement st =con.createStatement();
			ResultSet rs =st.executeQuery(query);
			
			while(rs.next()) {
			String employeetable ="EMP_ID-"+rs.getInt(1)+" ENAME- "+rs.getString(2)+" JOB_DESC- "+rs.getString(3)+"  SALARY- "+rs.getInt(4);
			
			System.out.println(employeetable);
			}
			st.close();
			con.close();

		}

}
