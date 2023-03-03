package Week3.day08_practices;

public class Number2Word {

    public static void main(String[] args) {

    int number = 8;
    String result = (number ==0)? result = "zero" : (number ==1)? result = "one" :
                (number ==2)? result = "two" : (number ==3)? result = "three" : (number == 4) ? result = "four" : (number == 5) ? result = "five" : (number == 6) ? result = "six" : (number == 7) ? result = "seven" : (number == 8) ? result = "eight" : (number == 9) ? result = "nine": "invalid";

        System.out.println(result);
    }
}
/*
1. Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary

 */