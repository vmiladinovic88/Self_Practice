package Week4.Day09_practices;

import java.util.Scanner;

public class People {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people do you live with? ");

        int num = input.nextInt();
        boolean howMany = (num >=0 && num <= 3) || (num>3 && num <=6) || (num>6);

        if(howMany){
            if(num>=0 && num <=3){
                System.out.println("Live with less than 3 people");
            }else if(num>3 && num <=6){
                System.out.println("Live with 3 - 6 people");
            }else {
                System.out.println("Live with \"more than 6 people");
            }
        }else{
            System.out.println("Invalid number");
        }
        input.close();
    }
}
/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
                if the user lives with more than 6 people: print "Live with "more than 6 people"


 */