public class UpdateOperation {
    public static void updateEmployee(int id, String name, String email, String gender, String city) {
        String query = "UPDATE employees SET name=?, email=?, gender=?, city=? WHERE id=?";

        try (Connection con = JDBCExample.getConnection(); 
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, gender);
            ps.setString(4, city);
            ps.setInt(5, id);

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee updated successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Update failed: " + e.getMessage());
        }
    }
}
