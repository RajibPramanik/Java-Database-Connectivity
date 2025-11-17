import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchData {
    public static void main(String[] args) {
        try{
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver class loaded successfully");

            // Estabilish connection
            String url = "jdbc:mysql://localhost:3306/jdbc_db";
            String user = "root";
            String password = "xxx";

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established"); 
            
            // Create statement
            PreparedStatement ps = con.prepareStatement("SELECT * from rp");

            // Execute the update query
            ResultSet rs = ps.executeQuery();

            // Fetch Data from MySQL
            while (rs.next()) { // When true then show
                // String name1 = rs.getString("name");
                // System.out.println(name1);

                System.out.println("Name: "+ rs.getString("name"));
                System.out.println("Email: "+ rs.getString("email"));
                System.out.println("Password: "+ rs.getString("password"));
                System.out.println("Gender: "+ rs.getString("gender"));
                System.out.println("----------------------------------------");
            }

            // Close connection
            ps.close();
            con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
