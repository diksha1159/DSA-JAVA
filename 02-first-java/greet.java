import java.util.Scanner;

class greet
{
    public static void main(String[] args)
    {
        
        System.out.println("Hello, Please Enter your name below: ");
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
                System.out.println("Hello,"+" " + name +" "+ "Just wanted to pop in and wish you the Best Day Ever!");
        }
    }
}
