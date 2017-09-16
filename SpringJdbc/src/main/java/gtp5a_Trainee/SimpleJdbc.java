package gtp5a_Trainee;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.mysql.jdbc.Connection;


public class SimpleJdbc {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		String insert = "INSERT INTO `gtp5a_trainee`.`new_table` (`id`, `name`, `age`, `designation`, `graduation_group`) VALUES ('14', 'satwik14', '27', 'mastres', 'civil')";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gtp5a_trainee","root","satwik123");
		Statement stObj = conn.createStatement();
	     stObj.executeUpdate(insert);
		
		

	}

}
