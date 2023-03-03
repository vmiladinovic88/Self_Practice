package Week3.day08_practices;

public class CydeoBatches {

    public static void main(String[] args) {

        String batch = "E";
        String result = "";
        if(batch == "US morning" || batch == "US evening" || batch == "EU")
        {
            switch (batch){
                case "US morning": result = "Class times are 10-5 EST. M, T, Th, F.";
                break;
                case "US evening": result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
                default: result = "Class times are  10-5 EST. M, T, W, Th, F.";
            }

        }else{
            result = "Invalid batch";
        }
        System.out.println(result);
    }
}
/*
10. Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */