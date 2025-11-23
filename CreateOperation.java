public class CreateOperation {
    public static void createEmployee(String name, String email, String gender, String city) {
        String query = "INSERT INTO employees (name, email, gender, city) VALUES (?, ?, ?, ?)";
        
        try (Connection con = JDBCExample.getConnection(); 
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, gender);
            ps.setString(4, city);

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Employee inserted successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Insert failed: " + e.getMessage());
        }
    }
}
