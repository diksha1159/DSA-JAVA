import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine(); // reads string

            // String str = "Radar",
            String reverseStr = "";

            int strLength = str.length();

            for (int i = (strLength - 1); i >= 0; --i) {
                reverseStr = reverseStr + str.charAt(i);
            }

            if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
                System.out.println(str + " is a Palindrome String.");
            } else {
                System.out.println(str + " is not a Palindrome String.");
            }
        }
    }
}