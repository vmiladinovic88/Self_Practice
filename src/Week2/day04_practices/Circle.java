package Week2.day04_practices;

public class Circle {

    public static void main(String[] args) {

       float radius = 5f,
               p = 3.14f,
                area = p * radius * radius ,
                perimeter =  2 * p * radius ;

        System.out.println("\tArea of the circle is " + area + "\n\tPerimeter of the circle is " + perimeter);


    }

}
/*
6. Create a class named Circle and declare the following variables:
                radius
                area
                perimeter

    6.1 Write a program that can calculate the area and perimeter of a circle with any given radius
            Ex:
                  radius = 5

            output:
                   Area of the circle is 78.5
                   Perimeter of the circle is 31.4
 */