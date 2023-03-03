package Week2.day06_practices;

public class OxygenTank {

    public static void main(String[] args) {

        int level = 32;

        String result = "";

        if(level <60){
            result = "Be careful now you at at 50%";
        }else if(level <70){
            result = "Start to head back";
        }else if(level <80){
            result = "Don't go too far";
        }else if(level <90){
            result = "still okay";
        }else if(level >=100){
            result = "your tank is full";
        }else {
            result = "invalid entry";
        }
        System.out.println(result);
    }
}
/*
8. Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */