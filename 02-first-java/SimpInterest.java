import java.util.Scanner;

public class SimpInterest 
{
    public static void main(String args[])
    
    {
        System.out.println("Enter the following detais to calculate the simple interest First Principal amount then Time in form of months and then rate of interest");
       
        try (Scanner sc = new Scanner(System.in)) 
        {
            float p; //principal amt will be stored
            int t; // time will be stored in the form of months
            double r; // rate of interest willl be stored
            double si;

          p = sc.nextFloat();
          t = sc.nextInt();
           r = sc.nextDouble();
            si = (p*r*t)/100;
            System.out.println("The Simple Interest of the entered values is: " + si);
    }
}
}
