package Week4.Day09_practices;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your hourly rate:");
        double hourlyRate = input.nextDouble();
        System.out.println("How many hours do you work in a week: ");
        int hours = input.nextInt();
        System.out.println("Enter state tax: ");
        double stateTax = input.nextDouble();
        System.out.println("Enter federal tax: ");
        double federalTax = input.nextDouble();
        double salary = hours * hourlyRate * 52;
        double stTax = stateTax * salary / 100;
        double feTax = federalTax * salary /100;
        double totalTax = feTax + stTax;
        double netIncome = salary - totalTax;

        System.out.println("salary is $" + salary);
        System.out.println("state tax is $" + stTax);
        System.out.println("federal tax is $" + feTax);
        System.out.println("total tax is $" + totalTax);
        System.out.println("net income is $" + netIncome);

    }
}
/*
10. Crreate a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */