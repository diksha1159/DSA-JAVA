
import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        System.out.println("Hello, Enter a character: ");
        try (Scanner scan = new Scanner(System.in)) {
            char ch1 = scan.next().charAt(0);

            // character whose ASCII value to be found is getting entered by the user

            // variable that stores the integer value of the character
            int asciivalue1 = ch1;

            System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);
        }

    }
}
