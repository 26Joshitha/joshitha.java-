import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;
        System.out.print("Enter username: ");
        username = scanner.nextLine();
        System.out.print("Enter password: ");
        password = scanner.nextLine();

        if (username.equals("joshi") && password.equals("56789")) {
            System.out.println("Login successful.\n");

            int choice;
            int count = 1; 

            while (count <= 5) {
                System.out.println("calculation #" + count);
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                if (choice == 0) {
                    System.out.println("Exiting...");
                    break;
                }
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0)
                            System.out.println("Result: " + (num1 / num2));
                        else
                            System.out.println("Error: Division by zero.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }

              count++;
               System.out.println();
            }

            if (count > 5) {
                System.out.println("You have reached the maximum of 5 calculations.");
            }

        } else {
            System.out.println("Login failed. Exiting program.");
        }

        //scanner.close();
    }
}
