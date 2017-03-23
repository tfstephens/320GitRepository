/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Taylor
 */
public class dbConnection {

    public static void main(String[] args) {
        // TODO code application logic here

        try {
            String dbURL1 = "jdbc:derby://localhost:1527/myDatabase;user=mis320;password=mis320";
            Connection conn1 = DriverManager.getConnection(dbURL1);
            if (conn1 != null) {
                System.out.println("Connected to database YAY");
            }

            Statement stmt = conn1.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PERSON");

            ArrayList<Person> collection1 = new ArrayList<Person>();
            
            // int no_of_rows = 0 ; 
            Person s1 = null;
            while (rs.next()) {
                s1 = new Person(rs.getInt("ID"), rs.getString("FIRSTNAME"), rs.getString("LASTNAME"), rs.getString("DATEOFBIRTH"), rs.getInt("SSN"),
                        rs.getInt("DRIVERLICENSE"), rs.getString("USERNAME"), rs.getString("PASSWORD"));
                collection1.add(s1);
            }            Iterator<Person> iterator = collection1.iterator();

            while (iterator.hasNext()) {
                System.out.println( iterator.next().getInfo());
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
