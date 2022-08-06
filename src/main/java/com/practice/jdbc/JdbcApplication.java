package com.practice.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
@SpringBootApplication
public class JdbcApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(JdbcApplication.class, args);

		String url="jdbc:mysql://localhost:3306/new_schema";
		String uname="root";
		String pass="khandelwal08";
		String query="select name from student where id=1";


//		Class.forName("com.mysql.jdbc.Driver");
		Connection conn= DriverManager.getConnection(url,uname,pass);

		Statement st= conn.createStatement();
		ResultSet ans=st.executeQuery(query);
		ans.next();
		System.out.println(ans.getString("name"));


		st.close();
		conn.close();

	}

}
