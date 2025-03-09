public class Operators04 {
    public static void main(String[] args) {

        int salary = 20000;
        int bonus = 1000;
        int monthlyTotal = salary + bonus;
        int earlyTotal = monthlyTotal * 12;
        int perChild = earlyTotal / 3;
        int educationPerChild = perChild-5000;
        /*
        System.out.printf("Total Salary is: %s %n :", monthlyTotal);
        System.out.println("Total Yearly Salary is : " + earlyTotal);
        System.out.println("Total Salary Per Child : " + perChild);
        System.out.println("After Education Fee : " + educationPerChild);
        */

        //% reminder
        //int a =20;
        // b = 3;
        //int reminder = a % b;
        //System.out.println(reminder);

        //important
        int num1 = 20;
        double num2 = 25;
        int num3 = (int) (num1 +num2);
        //System.out.println(num3);

        long x =438347634;
        long value = x*24223;
        //System.out.println(value);

        //Math Witz
//        int a = 10;
//        float b = 3;
//        double a = 10;
//        float b = 3f;
//        double quotient = a/b;
        //System.out.println(quotient);

        /*
        int a = 2;
        int b = a-2;
        int c = a/b;
        System.out.println(c);*/

       //int result = 5+2*2;
       //int result1 = (5+2)*2;
        //System.out.println(result);
        //System.out.println(result1);

        int x1 = 10;
        int x2 =5;
        int x3 = x1/x2 +3;
        int x4 = x1/x2 *3;
        int x5 = x1/x2 +3*2-1;
        //System.out.println(x5);
        //System.out.println(x3);

        //compound assignment operator
        int P = 10;
        P += 5;
        int p1 = 20;
        p1%=2;
        //System.out.println(p1);

        byte b = 10;
        //b = (byte) (b+5);
        b+=5; //automatically
        //System.out.println(b);

        //increment & decrement
        int number1 =1;
        number1 ++;
        //System.out.println(number1);
        number1--;
        //System.out.println(number1);
        ++number1;
        //System.out.println(number1);
        --number1;
        //System.out.println(number1);
        //int number2 = number1 + (++number1);
        int number2 = number1 + number1++;
        //System.out.println(number2);

        double d= 1.5, e =2.5 ,f=3.5;
        double complexCalculation = (d+e)*(f-e)/(d+f); //4*1/5
        System.out.println(complexCalculation);
    }
}
