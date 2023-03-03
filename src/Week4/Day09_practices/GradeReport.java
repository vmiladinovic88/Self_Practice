package Week4.Day09_practices;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score: ");

        int score = input.nextInt();
        boolean isValid = score >= 0 && score <= 100;

        if(isValid){
            if(score >= 60) {
                System.out.println("D");
            }else if (score >= 70){
                System.out.println("C");
            }else if (score >= 80){
                System.out.println("B");
            }else {
                System.out.println("A");
            }
        }else{
            System.out.println("Invalid score");
        }

        input.close();


    }
}
/*
3. Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

 */