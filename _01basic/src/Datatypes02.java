public class Datatypes02 {
    public static void main(String[] args) {
        /*Primitive types start with a lowercase letter (like int), while  Reference
        starts with an uppercase letter (like String) & Class with PascalCase.😀

        primitive data type❗ implicit conversion
            byte, short, int, long, float, double, char,boolean etc.
        non-primitive❗ explicit conversion
            String, Array, Classes etc.
        */

        byte age1 = 127; //1byte
        short age2 =11;  //2byte
        int age = 20;   //4byte
        long age3 =23;  //8byte

        System.out.println(age3);
        /*Integer is a wrapper class in Java that belongs to java.lang package. It wraps
        A primitive int into an object and provides utility methods for working with integers.

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);*/

        float p = 3.14f; //4byte
        double ai = 40.4; //8byte

        /*System.out.println(ai);
        System.out.println(p);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);*/

        char c ='a';
        char bb = 'B';
        char heart = 10084;
        char hindi = 2309;
        char heartSymbol = '\u2764'; //unique code representation

        /*System.out.println(heartSymbol);
        System.out.println((int) c);
        System.out.println((int) b);
        System.out.println(c);
        System.out.println(hindi);
        System.out.println(heart);
        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);*/


        boolean canVote = true;
        boolean canEat = false;

        /*System.out.println(canEat);
        System.out.println(canVote);*/

        String name = "Prince Singh";
        System.out.println(name);

        //Widening Casting (automatically) - converting a smaller type to a larger type size
        //byte -> short -> char -> int -> long -> float -> double
        int a = 10;
        int b = a;
        System.out.println(b);
        float f = a;
        System.out.println(f);

        //Narrowing Casting (manually) - converting a larger type to a smaller size type
        //double -> float -> long -> int -> char -> short -> byte

        float pi =3.14f;
        int pi1 = (int)pi;
        System.out.println(pi1);

        double price = 412.45;
        int price1 = (int)price;
        System.out.println(price1);

        long num = 2451;
        int num1 = (int) num;
        System.out.println(num1);

        String str = "54";
        System.out.println(Integer.parseInt(str));
        System.out.println(Integer.valueOf(str));

        System.out.println(Integer.toBinaryString(14511));
    }
}
