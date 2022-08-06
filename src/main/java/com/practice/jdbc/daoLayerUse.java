package com.practice.jdbc;
import java.lang.*;
//dao-> data Access Object

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Class.forName;

public class daoLayerUse {

    public student getStudent(int rollno){
        String url="jdbc:mysql://localhost:3306/new_schema";
        String uname="root";
        String pass="khandelwal08";
        String query="select name from student where id="+rollno;
        try{
            student s=new student();
            s.id=rollno;
//            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url,uname,pass);

            Statement st= conn.createStatement();
            ResultSet ans=st.executeQuery(query);
            ans.next();
            String name=ans.getString("name");
            s.name=name;
            return s;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}



class student{
    String name;
    int id;
}
