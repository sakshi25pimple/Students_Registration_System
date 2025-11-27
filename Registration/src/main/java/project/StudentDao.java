package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	public boolean saveStudent(Object s) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_dbt","root","root");

        String q = "insert into student1 values(?,?,?,?)";
        		
		PreparedStatement pmt = con.prepareStatement(q);
	   pmt.setString(1, s.getId());
	   pmt.setString(2, s.getName());
	   pmt.setString(3, s.getEmail());
	   pmt.setString(4, s.getAge());
	   
        
        int row = pmt.executeUpdate();
		boolean status = false;
		if(row>0) {
			status = true;}
		return status;
		
		
	}

	public List<Object> accessAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_dbt","root","root");
		String q = "select * from student1";
		PreparedStatement pmt = con.prepareStatement(q);
		ResultSet rs =pmt.executeQuery();
		List<Object> slist = new ArrayList<>();
		
		while(rs.next()) {
			Object s = new Object(rs.getString("id"),
					rs.getString("name"),
					rs.getString("email"),
					rs.getString("age"));
			slist.add(s);
		}
		return slist;
		
		
	}

	
}
