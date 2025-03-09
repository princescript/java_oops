package datatypes;

import java.awt.*;

public class TestString {
    public static void main(String[] args) {

        /*This explicitly creates a new String object on the heap using the new keyword. Even if a
         string with the value "Rahul" already exists in the String Pool, this code will create a new
          String object in memory (outside the String Pool), which is less efficient.*/

        String name1 = new String("Rahul");
        String name2 = new String("Rahul");
        System.out.println(name1 == name2); //false cuz both are different
        System.out.println("------------");

        String x = "Ram";
        String a = new String("Ram");
        String b = new String(x);
        System.out.println(a == b);


        /*Java stores string literals in a special memory pool called the String Pool
         If a string with the same value already exists in the pool, Java reuses it rather
         than creating a new one. This is more memory-efficient.*/
        System.out.println("------------");
        String myName1 = "Ram";
        String myName2 = "Ram";
        System.out.println(myName1 == myName2);
    }
}
