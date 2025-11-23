import java.sql.*;

public class JDBCExample {
    // JDBC URL, username, and password
    static final String URL = "jdbc:mysql://localhost:3306/mydatabase";
    static final String USER = "root";
    static final String PASSWORD = "root";

    // Establishing the connection to the database
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
            return null;
        }
    }
}
