package connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	public Connection getConnection()throws Exception {
        String url = "jdbc:mysql://localhost:3306/newsservlet";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, userID, password);
    }   
    /*Insert your other code right after this comment*/
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    
    private final String userID = "root";
    private final String password = "Trinhlke98@";

}
