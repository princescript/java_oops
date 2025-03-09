public class Main {
    public static void main(String[] args) {
        /*relational operators compare two operant and return boolean value
        Less than: a < b
        Less than or equal to: a <= b
        Greater than: a > b
        Greater than or equal to: a >= b
        Equal to a == b
        Not Equal to: a != b*/

        //locical
        int a = 10;
        int b = 24;
        boolean c = a < b && a > 5;
        //System.out.println(c);
        //if(true){
        //    System.out.println("Hello Beta");
        //}
        int myAge = 25;
        if (myAge < 13) {
            System.out.println("You are a child.");
        } else if (myAge >= 13 && myAge < 18) {
            System.out.println("You are a teenager.");
        } else if (myAge >= 18 && myAge < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
        // Switch Case Statement
        int day = 8;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please Enter Right Day");
        }
    }
}