package Week4.Day09_practices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.println("Enter a math operator: ");
        String operator = input.next();

        System.out.println("Enter the second number: ");
        double secondNumber = input.nextDouble();

        double result = 1;

            switch (operator){
            case "+":
                result = (firstNumber + secondNumber);
                System.out.println(result);
                break;
                case "-":
                result = (firstNumber - secondNumber);
                System.out.println(result);
                break;
                case "*":
                result = (firstNumber * secondNumber);
                System.out.println(result);
                break;
                case "/":
                result = (firstNumber/secondNumber);
                System.out.println(result);
                break;
                default:
            System.out.println("Invalid entry");
        }
        input.close();
    }
}
/*
. Create a class named Claculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"

 */