public class ReadOperation {
    public static void readEmployees() {
        String query = "SELECT * FROM employees";

        try (Connection con = JDBCExample.getConnection(); 
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String gender = rs.getString("gender");
                String city = rs.getString("city");

                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Gender: " + gender + ", City: " + city);
            }
        } catch (SQLException e) {
            System.out.println("Read failed: " + e.getMessage());
        }
    }
}
