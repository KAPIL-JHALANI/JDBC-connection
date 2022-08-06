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

		//jdbc-> java database connection
		/*
			1. Import the package  (import java.sql.*);
			2. Load and register the driver  (Class.forName("com.mysql.jdbc.Driver"))  forName-> load the class and static block of class
			   and do not create the instance of the class.
			3.Establish the connection  (Connection conn= DriverManager.getConnection(url,uname,pass);)
			4.Create the statement  (Statement st= conn.createStatement();)
			5.Execute the query  (ResultSet ans=st.executeQuery(query);) different for DML AND DDL AND etc.
			6.Process Result
			7.close connection
		 */




//      normal jdbc use

//		String url="jdbc:mysql://localhost:3306/new_schema";
//		String uname="root";
//		String pass="khandelwal08";
//		String query="select name from student where id=1";
//
//
////		Class.forName("com.mysql.jdbc.Driver");
//		Connection conn= DriverManager.getConnection(url,uname,pass);
//
//		Statement st= conn.createStatement();
//		ResultSet ans=st.executeQuery(query);
//		ans.next();
//		System.out.println(ans.getString("name"));
//
//
//		st.close();
//		conn.close();


		//dao layer use

		daoLayerUse temp=new daoLayerUse();
		student s=temp.getStudent(2);
		System.out.println(s.name);


	}

}
