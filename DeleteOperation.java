public class DeleteOperation {
    public static void deleteEmployee(int id) {
        String query = "DELETE FROM employees WHERE id=?";

        try (Connection con = JDBCExample.getConnection(); 
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, id);

            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Employee deleted successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Delete failed: " + e.getMessage());
        }
    }
}
