package Week2.day06_practices;

public class AgeGroup {

    public static void main(String[] args) {

        int age = 4;
        String ageGroup = "";

        if ( age <=2){
            ageGroup = "infant";
        }else if (age <=5){
            ageGroup = "toddler";
        }else if (age <=9){
            ageGroup = "kid";
        }else if (age <=12){
            ageGroup = "Pre-teen";
        }else if (age <=17 ){
            ageGroup = "teenager";
        }else if (age <= 20){
            ageGroup = "young adult";
        }else if (age <= 39){
            ageGroup = "adult";
        }else if (age <= 49){
            ageGroup = "young middle age adult";
        }else if (age <= 54){
            ageGroup = "middle age adult";
        }else if (age <= 64){
            ageGroup = "very young senior citizen";
        }else if (age <= 74){
            ageGroup = "young senior citizen";
        }else if (age <= 84){
            ageGroup = "senior citizen";
        }else if (age >=85 && age < 101){
            ageGroup = "old senior citizen";
        }else {
            System.out.println("Invalid age");
        }

        System.out.println(ageGroup);


    }
}
/*
Create a class named AgeGroups, an integer variable named age is declared and given. write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

            Note: Do not use more than one print statement
 */