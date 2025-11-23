import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete{
    public static void main(String[] args){
        try{
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver class loaded successfully");

            // Estabilish connection
            String url = "jdbc:mysql://localhost:3306/jdbc_db";
            String user = "root";
            String password = "xxxxxx";

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established");

            // Create statement
            String email1 = "jone@gmail.com";
            PreparedStatement ps = con.prepareStatement("DELETE from rp WHERE email=?");
            ps.setString(1, email1);

            // Execute the update query
            int i = ps.executeUpdate();

            // Check if update was successful
            if (i > 0) {
                System.out.println("Record delete successfully");
            } else {
                System.out.println("Record not delete");
            }

            // Close connection
            ps.close();
            con.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
