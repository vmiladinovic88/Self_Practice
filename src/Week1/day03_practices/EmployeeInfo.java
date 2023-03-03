package Week1.day03_practices;

public class EmployeeInfo {

    public static void main(String[] args) {

        /*
1. name
2. age
3. gender
4. companyName 5. employeeId
6. jobTitle
7. salary
8. isFullTime
         */

        String name = "Vesna",
                gender = "female",
                companyName = "Oracle Inc",
                jobTitle = "SDET",
                employeeId = "A077";

        int age = 34,
                salary = 100000;

        boolean isFullTime = true;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("employeeId = " + employeeId);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);

    }

}
