import java.util.Scanner;

 class LargeNo 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello, World!"); 
        try (// Assuming the numbers will be integers
        Scanner scan = new Scanner(System.in)) 
        {
            {
                System.out.println("Enter the numbers"); // Ask the user for something
                int num1 = scan.nextInt(); // Read value from user
                int num2 = scan.nextInt(); // Read value from user
                //int sum = num1+num2;
                
                if (num1>num2)
                {
                    System.out.println("First number is Greater than the other");

                }
                else
                {
                System.out.println("Second number is Greater than the First");
                }
            }
        }
    }
}
