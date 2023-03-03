package Week3.day08_practices;

public class AgeGroups {

    public static void main(String[] args) {

        int ageGroups = 97;

        String result = (ageGroups == 1 || ageGroups == 2)? "infant" :
                (ageGroups > 2 && ageGroups <6) ? "toddler" :
                        (ageGroups >=6 && ageGroups <=9) ? "kid" :
                                (ageGroups >=10 && ageGroups <=12)? "pre-Teen" :
                                        (ageGroups >=13 && ageGroups <=17) ? "teenager" :
                                                (ageGroups >=18 && ageGroups <= 20) ? "young adult ":
                                                        (ageGroups >=21 && ageGroups <=39) ? "adult" :
                                                                (ageGroups >=40 && ageGroups <=49) ? "Young Middle-Aged Adult":
                                                                        (ageGroups >=50 && ageGroups <=54 )? "Middle-Aged Adult" :
                                                                                (ageGroups >= 55 && ageGroups <=64)? "Very Young Senior Citizen" :
                                                                                        (ageGroups >=65 && ageGroups <= 74)? "Young Senior Citizen"  : (ageGroups >= 75 && ageGroups <= 84)? "Senior Citizen" :  "Old Senior Citizen";


        System.out.println(result);



    }
}
/*
3. Create a class called AgeGroups
		write a program that can define the age groups of a person

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

        Note: MUST use ternary
 */