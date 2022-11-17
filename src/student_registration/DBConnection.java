package student_registration;

//IMPORTING THE MYSQL CONNECTOR JAVA PACKAGE 
import java.sql.*;
import java.sql.Connection;

//DEFINING THE CLASS FOR THE CONNECTION 
public class DBConnection {

    static final String DB_URL = "jdbc:mysql://localhost/studentsecure_db"; //link to my database 
    static final String USER = "root";   //user of the database 
    static final String PASS = "Shiznixshades"; //password of the database for access

    public static Connection connectDB() {
        Connection conn = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");  //connecting with JDBC 

            //open a connection      
            conn = DriverManager.getConnection(DB_URL, USER, PASS); 
            System.out.println("Connected");
            return conn;
            
           //TO CATCH ANY ERROR THAT MIGHT BE GIVEN IN THE CONNECTION PROOCESS 
        } catch (Exception e) {
            System.out.println("There were errors while connecting to the db.");
            return null;
        }

    }
}
