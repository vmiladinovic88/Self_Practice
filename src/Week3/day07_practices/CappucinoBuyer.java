package Week3.day07_practices;

public class CappucinoBuyer {

    public static void main(String[] args) {

        String size = "venti";

        if( size == "tall" || size == "venti" || size == "grande"){
            if(size == "tall"){
                System.out.println("tall:\n\t\tprice is $3.69\n\t\t90 calories");
            }else if( size == "grande"){
                System.out.println("grande:\n\t\tprice is $3.99\n\t\t120 calories");
            }else{
                System.out.println("venti:\n\t\tprice is $4.29\n\t\t150 calories");
            }
        }else {
            System.out.println("Invalid size");
        }


    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if

 */