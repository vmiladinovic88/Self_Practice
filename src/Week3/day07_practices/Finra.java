package Week3.day07_practices;

public class Finra {

    public static void main(String[] args) {

        int number = 5;
        String result = "";
        if(number % 3 == 0 && number % 5 == 0){
            result = "FINRA";
            }else if(number % 3 == 0){
            result = "FIN";
        }else if(number % 5 == 0){
            result = "RA";
        }else{
            result = "not multiple";
            }

            System.out.println(result);

        System.out.println("------------------");

        int num = 7;
        boolean by3 = num % 3 == 0;
        boolean by5 = num % 5 == 0;

        if(by3 && by5) { // num % 15 == 0
            System.out.println("FINRA");
        } else if(by3){
            System.out.println("FIN");
        } else if(by5){
            System.out.println("RA");
        } else {
            System.out.println(num);
        }

        System.out.println( by3 && by5 ? "FINRA" : by3 ? "FIN" : by5 ? "RA" : num);




    }
}
/*
6. Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3

                output:
                      FIN


                number = 10

	            output:
	                RA


            	number = 15

	            output:
	                FINRA
 */