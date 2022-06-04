import java.util.Scanner;

public class BasicCal {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        try (// Assuming the numbers will be integers
                Scanner scan = new Scanner(System.in)) {

            System.out.println("Enter two numbers"); // Ask the user for something
            int num1 = scan.nextInt(); // Read value from user
            int num2 = scan.nextInt(); // Read value from user

            System.out.println(
                    "what do you want to perform? press 'A' for 'Addition', 'S' for 'Substraction', 'M' for 'Multiplication', 'D' for 'Division'"); // Ask
                                                                                                                                                    // the
                                                                                                                                                    // user
                                                                                                                                                    // for
                                                                                                                                                    // his
                                                                                                                                                    // operation
            char choice = scan.next().charAt(0); // Read value from user

            if (choice == 'A') {
                int add = num1 + num2;
                System.out.println("Sum of the two entered numbers is: " + add);
            } else if (choice == 'S') {
                int sub = num1 - num2;
                System.out.println("Substraction of the two entered numbers is: " + sub);
            } else if (choice == 'M') {
                int mul = num1 * num2;
                System.out.println("multiplication of the two entered numbers is: " + mul);

            } else if (choice == 'D') {
                int div = num1 / num2;
                System.out.println("division of the two entered numbers is: " + div);

            } else {
                System.out.println("Wrong choice try again!");
            }

        }
    }
}
