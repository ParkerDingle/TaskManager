import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        boolean running = true;

        while(running) {
            System.out.printf("Please choose an option:%n1. Add a task%n2. List tasks%n3. Remove a task%n4. Exit%n%nEnter your choice:");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    // Adding a task
                    System.out.print("Enter task description: ");
                    String description = input.nextLine();
                    System.out.print("Enter priority (1‑5): ");
                    int priority;
                    try {
                        priority = Integer.parseInt(input.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid priority. Please enter a number.\n");
                        break;
                    }
                    System.out.print("Enter due date (e.g., 2025‑09‑30): ");
                    String dueDate = input.nextLine();

                    manager.addTask(new Task(description, priority, dueDate));
                    break;

                case "2":
                    // Listing tasks
                    manager.listTasks();
                    break;

                case "3":
                    // Removing a task
                    System.out.print("Enter the task number to remove: ");
                    int index;
                    try {
                        index = Integer.parseInt(input.nextLine().trim()) - 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number.\n");
                        break;
                    }
                    manager.removeTask(index);
                    break;

                case "4":
                    // Exit
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
        }
    }

