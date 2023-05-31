package Activitys;

public class Activity8 {

    public static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {

        try {
            Activity8.exceptionTest("Will print to console");
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("Will not be executed");
        } catch(CustomException e) {
            System.out.println("Enter catch block: " + e.getMessage());
        }
    }


}
