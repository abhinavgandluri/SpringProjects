package gtp5a_Trainee;
import java.sql.*;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

@Repository(value="gtp5aObj")
public class GTP5A_TraineeDao {
	@Autowired
	public JdbcTemplate jdbcTemplate;

	private final String INSERT_GTP5A = "INSERT INTO `new_table` (`id`, `name`, `age`, `designation`, `graduation_group`) VALUES ('10', 'ravi', '25', 'masters', 'civil')";
    private final String UPDATE_GTP5A = "UPDATE `gtp5a_trainee`.`new_table` SET `name`='hari1', `age`='26', `designation`='masters2', `graduation_group`='civil3' WHERE `id`='5'";
    private final String DELETE_GTP5A = "DELETE FROM `gtp5a_trainee`.`new_table` WHERE `id`='4'";
	private final String INSERT_PREP_GTP5A = "INSERT INTO `new_table`(`id`,`name`,`age`, `designation`, `graduation_group`) VALUES (?,?,?,?,?)";
	
    //Inserting data into database
	public void insertGtp5a() {
		System.out.println("Inserting the data into database and insertGtp5a method is called ");
		int noOfRowsInserted = jdbcTemplate.update(INSERT_GTP5A);
		System.out.println("no of rows inserted: "+noOfRowsInserted);
	}
//	Updating data into Database
	public void updateGtp5a() {
		System.out.println("updating the data into database and updateGtp5a method is called");
		int noOfRowsUpdated = jdbcTemplate.update(UPDATE_GTP5A);
		System.out.println("No of rows updated : "+noOfRowsUpdated);
	}
	
   //Deleting data from database
	public void deleteGtp5a() {
		System.out.println("deleting the data from database");
		int noOfRowsDeleted = jdbcTemplate.update(DELETE_GTP5A);
		System.out.println("No of rows deleted :"+noOfRowsDeleted);
		
	}
	
   public void insertGtp5aPrepared(final GTP5A_Trainee gtp5a_trainee){
	   int i = jdbcTemplate.update(INSERT_PREP_GTP5A, new PreparedStatementSetter(){
		   public void setValues(PreparedStatement ps)
					throws SQLException {
			  
               ps.setInt(1,gtp5a_trainee.getId());
               ps.setString(2, gtp5a_trainee.getName());
               ps.setInt(3, gtp5a_trainee.getAge());
               ps.setString(4, gtp5a_trainee.getDesignation());
               ps.setString(5, gtp5a_trainee.getGraduation_group()); 
               }
	
	   });
	  
   }

}

