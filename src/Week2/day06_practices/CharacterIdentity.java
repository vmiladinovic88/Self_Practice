package Week2.day06_practices;

public class CharacterIdentity {

    public static void main(String[] args) {

char ch = '7';
String result = "";

if (ch >= 48 && ch <= 57){
    result = "digit";
}else {
    result = "special character";
}
        System.out.println(result);
    }

}
/*
. Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table

 */