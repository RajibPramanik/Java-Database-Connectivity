import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
// import java.sql.Statement;

public class InsertDemo {
    public static void main(String[] args) {
        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver class loaded successfully");

            // Establish connection (update URL, username, password)
            String url = "jdbc:mysql://localhost:3306/jdbc_db"; // replace jdbc_db with your DB name
            String user = "root";  // your MySQL username
            String password = "xxx"; // your MySQL password


            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established");


            // Creat statement
            PreparedStatement ps = con.prepareStatement("insert into rp value('Java', 'Java@gmail.com', '12345', 'male')");
            
            // Execute the insert query
            int i = ps.executeUpdate();

            // Check if insert was successful
            if (i > 0) {
                System.out.println("Record inserted successfully");
            } else {
                System.out.println("Record not inserted");
            }

            // Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}