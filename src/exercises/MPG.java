package exercises;
import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive today?");
        Double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas did you use?");
        Double gallonsUsed = input.nextDouble();

        Double mpg = milesDriven / gallonsUsed;
        System.out.println("You are currently getting " + mpg + " mpg.");
    }
}
