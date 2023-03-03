package Week2.day04_practices;

public class SalaryCalculator1 {

    public static void main(String[] args) {
        double hourlyRate = 50,
                stateTaxRate = 0.06,
                federalTaxRate = 0.26,
                weeklyHours = 45,

                salaryBeforeTax = hourlyRate * weeklyHours * 52;

        double   stateTax = stateTaxRate * salaryBeforeTax,
                federalTax = federalTaxRate * salaryBeforeTax;

        double totalTax = stateTax + federalTax;

        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("\tGross pay is $" + salaryBeforeTax);
        System.out.println("\t\tFederal tax is $" + federalTax);
        System.out.println("\t\tState tax is $" + stateTax);
        System.out.println("\t\tTotal tax is $" + totalTax);
        System.out.println("\t\tNet income is $" + salaryAfterTax);




    }
}
/*

7. Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

    7.1 Use the given info above to calculate the followings:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax

    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

        output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560
 */