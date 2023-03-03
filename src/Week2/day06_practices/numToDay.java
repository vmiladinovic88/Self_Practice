package Week2.day06_practices;

public class numToDay {

    public static void main(String[] args) {

        int num =9;

        String result = "";

        if(num == 1){
            result = "one";
        }else if( num == 2){
            result = "two";
        }else if (num == 3){
            result = "three";
        }else if (num == 4){
            result = "four";
        }else if (num == 5){
            result = "five";
        }else if (num == 6){
            result = "six";
        }else if (num == 7){
            result = "seven";
        }else if (num == 8){
            result = "eight";
        }else {
            result ="nine";
        }

        System.out.println(result);
    }
}
/*
2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement

 */