public class Main {
    public static void main(String[] args) {
        // Create operation
        CreateOperation.createEmployee("John Doe", "john@example.com", "Male", "New York");

        // Read operation
        System.out.println("Reading all employees:");
        ReadOperation.readEmployees();

        // Update operation
        System.out.println("\nUpdating employee with id 1:");
        UpdateOperation.updateEmployee(1, "John Smith", "johnsmith@example.com", "Male", "Los Angeles");

        // Read after update
        System.out.println("\nReading all employees after update:");
        ReadOperation.readEmployees();

        // Delete operation
        System.out.println("\nDeleting employee with id 1:");
        DeleteOperation.deleteEmployee(1);

        // Read after delete
        System.out.println("\nReading all employees after delete:");
        ReadOperation.readEmployees();
    }
}
