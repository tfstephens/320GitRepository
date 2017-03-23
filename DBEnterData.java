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
/**
 *
 * @author Taylor
 */
public class DBEnterData {
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String dbURL1 = "jdbc:derby://localhost:1527/myDatabase;user=mis320;password=mis320";
            
            //Person 1----------------------------------------------------------------
            Connection conn1 = DriverManager.getConnection(dbURL1);
            if (conn1 != null) {
                System.out.println("Connected to database person 1 YAYYY");
            }

            String query1 = "INSERT INTO PERSON(ID,FIRSTNAME,LASTNAME,DATEOFBIRTH,SSN,DRIVERLICENSE,USERNAME,PASSWORD ) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            Person s = new Person(1, "John", "Smith", "1/1/80", 123456789,1234567,"jSmith","jsmitty1234");

            // set all the preparedstatement parameters
            PreparedStatement st = conn1.prepareStatement(query1);
            st.setInt(1, s.getId());
            st.setString(2, s.getfName());
            st.setString(3, s.getlName());
            st.setString(4, s.getDob());
            st.setInt(5, s.getSsn());
            st.setInt(6, s.getdLicense());
            st.setString(7, s.getUserName());
            st.setString(8, s.getPassword());
            // execute the preparedstatement insert
            st.executeUpdate();
            st.close();
            
            //Person 2------------------------------------------------------------------
            Connection conn2 = DriverManager.getConnection(dbURL1);
            if (conn2 != null) {
                System.out.println("Connected to database person 2 YAYYY");
            }
            String query2 = "INSERT INTO PERSON(ID,FIRSTNAME,LASTNAME,DATEOFBIRTH,SSN,DRIVERLICENSE,USERNAME,PASSWORD ) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            Person s2 = new Person(2, "Jane", "Doe", "4/5/84", 963612684,2455173,"jDoe","hanShotFirst");
            // set all the preparedstatement parameters
            PreparedStatement st2 = conn2.prepareStatement(query2);
            st2.setInt(1, s2.getId());
            st2.setString(2, s2.getfName());
            st2.setString(3, s2.getlName());
            st2.setString(4, s2.getDob());
            st2.setInt(5, s2.getSsn());
            st2.setInt(6, s2.getdLicense());
            st2.setString(7, s2.getUserName());
            st2.setString(8, s2.getPassword());
            // execute the preparedstatement insert
            st2.executeUpdate();

            st2.close();
            
            //Person 3------------------------------------------------------------------
            Connection conn3 = DriverManager.getConnection(dbURL1);
            if (conn3 != null) {
                System.out.println("Connected to database person 3 YAYYY");
            }
            String query3 = "INSERT INTO PERSON(ID,FIRSTNAME,LASTNAME,DATEOFBIRTH,SSN,DRIVERLICENSE,USERNAME,PASSWORD ) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            Person s3 = new Person(3, "Marty", "McFly", "6/12/68", 198237465, 6543981,"mMcFly","johnnyBGoode!");
            // set all the preparedstatement parameters
            PreparedStatement st3 = conn3.prepareStatement(query3);
            st3.setInt(1, s3.getId());
            st3.setString(2, s3.getfName());
            st3.setString(3, s3.getlName());
            st3.setString(4, s3.getDob());
            st3.setInt(5, s3.getSsn());
            st3.setInt(6, s3.getdLicense());
            st3.setString(7, s3.getUserName());
            st3.setString(8, s3.getPassword());
            // execute the preparedstatement insert
            st3.executeUpdate();

            st3.close();
            
             Connection conn4 = DriverManager.getConnection(dbURL1);
            if (conn4 != null) {
                System.out.println("Connected to database person 4 YAYYY");
            }

            String query4 = "INSERT INTO PERSON(ID,FIRSTNAME,LASTNAME,DATEOFBIRTH,SSN,DRIVERLICENSE,USERNAME,PASSWORD ) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            Person s4 = new Person(4, "John", "Cena", "4/23/77", 918273645, 5826014, "jCena", "UcantSEEme");

            // set all the preparedstatement parameters
            PreparedStatement st4 = conn4.prepareStatement(query4);
            st4.setInt(1, s4.getId());
            st4.setString(2, s4.getfName());
            st4.setString(3, s4.getlName());
            st4.setString(4, s4.getDob());
            st4.setInt(5, s4.getSsn());
            st4.setInt(6, s4.getdLicense());
            st4.setString(7, s4.getUserName());
            st4.setString(8, s4.getPassword());
            // execute the preparedstatement insert
            st4.executeUpdate();
            
            st4.close();
            
            //Person 1----------------------------------------------------------------
            Connection conn5 = DriverManager.getConnection(dbURL1);
            if (conn5 != null) {
                System.out.println("Connected to database person 5 YAYYY");
            }

            String query5 = "INSERT INTO PERSON(ID,FIRSTNAME,LASTNAME,DATEOFBIRTH,SSN,DRIVERLICENSE,USERNAME,PASSWORD ) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            Person s5 = new Person(5, "Penelope", "Tucker", "2/15/72", 987123654, 1875091, "pTucker","passw0rd!23");

            // set all the preparedstatement parameters
            PreparedStatement st5 = conn5.prepareStatement(query5);
            st5.setInt(1, s5.getId());
            st5.setString(2, s5.getfName());
            st5.setString(3, s5.getlName());
            st5.setString(4, s5.getDob());
            st5.setInt(5, s5.getSsn());
            st5.setInt(6, s5.getdLicense());
            st5.setString(7, s5.getUserName());
            st5.setString(8, s5.getPassword());
            // execute the preparedstatement insert
            st5.executeUpdate();
            
            st5.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
