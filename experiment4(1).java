import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> itemList = new ArrayList<>();

        while (true) {
            try {
                System.out.println("\n1. Insert");
                System.out.println("2. Search");
                System.out.println("3. Delete");
                System.out.println("4. Display");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1: // Insert
                        System.out.print("Enter the item to be inserted: ");
                        String insertItem = scanner.nextLine();
                        itemList.add(insertItem);
                        System.out.println("Inserted successfully");
                        break;

                    case 2: // Search
                        System.out.print("Enter the item to search: ");
                        String searchItem = scanner.nextLine();
                        if (itemList.contains(searchItem)) {
                            System.out.println("Item found in the list.");
                        } else {
                            System.out.println("Item not found in the list.");
                        }
                        break;

                    case 3: // Delete
                        System.out.print("Enter the item to delete: ");
                        String deleteItem = scanner.nextLine();
                        if (itemList.remove(deleteItem)) {
                            System.out.println("Deleted successfully");
                        } else {
                            System.out.println("Item does not exist.");
                        }
                        break;

                    case 4: // Display
                        if (itemList.isEmpty()) {
                            System.out.println("The list is empty.");
                        } else {
                            System.out.println("The items in the list are:");
                            for (String item : itemList) {
                                System.out.println(item);
                            }
                        }
                        break;

                    case 5: // Exit
                        System.out.println("Exiting... Goodbye!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 5.");
                scanner.nextLine(); // Clear invalid input
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
}
