package Week4.Day09_practices;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");

        double r = input.nextDouble();

        double p = 2 * r * 3.14;
        double area = 3.14 * r * r;

        System.out.println("Perimeter of the circle is " + p);
        System.out.println("Area of the circle is " + area);

        input.close();
    }
}
/*
2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

 */