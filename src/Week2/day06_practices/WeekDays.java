package Week2.day06_practices;

public class WeekDays {

    public static void main(String[] args) {

        int day = 1;
        String result = "";

        if(day == 1) {
            result = "Monday";
        }
        if(day == 2){
            result = "Tuesday";
        }
        if (day == 3){
            result = "Wednesday";
        }
        if (day == 4){
            result = "Thursday";
        }
        if (day == 5){
            result = "Friday";
        }
        if(day == 6){
            result = "Saturday";
        }
        if(day == 7){
            result = "Sunday";
        }

        System.out.println(result);
    }
}
/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a program that can print the name of the day that the number represents
Ex: Given:
number = 1
output: Monday
Hint: Assume that a number between 1 ~ 7 is given to the variable
 */