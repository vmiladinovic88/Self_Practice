package Week2.day04_practices;

public class CarInfo {

    public static void main(String[] args) {

        int year = 2018;
        String make = "Toyota",
                model = "Camry",
                color = "Red";
        int miles = 50_000;
        int price = 19_000;

        System.out.println(year + " " + make + " " + model + ", " + miles + " miles, " + color +", " + "$" + price + ".");


    }
}
/*
1. Create a class named CarInfo.java
2. Declare the following variables:

    1. year
    2. make
    3. model
    4. miles
    5. color
    6. Price
3. Use concatenation to print the full info of the car in the
following format:
    Year Make Model, Miles, Color, Price.
Ex:
    Car information is :
        2018 Toyota Camry, 50000 miles, Red, $19000.
 */