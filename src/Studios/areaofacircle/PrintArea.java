package Studios.areaofacircle;

import java.util.Scanner;
public class PrintArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = in.nextDouble();
        Double areaOfCircle = Area.getArea(radius);
        System.out.println("The area of a circle with the radius of " + radius + " is: " + areaOfCircle);
    }
}