import java.util.Locale;

public class PrintInJava06 {
    public static void main(String[] args) {
        int a =5;
        int b = 5;
        String c ="sum";
        float f = 3.14f;

        //System.out.println(a+b+c); //10sum
        //System.out.println(c+a+b); //if first string then all will be concat
        //System.out.println(a+c+b); //5sum5
       //System.out.println(c + " :" + (a+b));
//        System.out.println(c+ " of " + a + " & " + b +" = " + (a+b));
//        System.out.print(c+ " of " + a + " & " + b +" = " + (a+b) +"\n");
//        System.out.printf(c+ " of " + a + " & " + b +" = " + (a+b) + "\n");
//        System.out.printf("hello");

        /* Format Specifiers in Java✅✅✅
        printf() → Formats output with placeholders (%d, %s, etc.), similar to C's printf().
        %d	Integer (int, short, long, byte)	Decimal integer
        %f	Floating point (float, double)	Decimal number (default 6 decimal places)
        %s	String	Prints a string
        %c	Character	Prints a single character
        %b	Boolean	Prints true or false
        %e	Floating point (float, double)	Scientific notation (exponential)
        */


        System.out.printf(c+ " of " + a + " & " + b +" = " + (a+b));
        System.out.println();
        System.out.printf("%s of %d & %d : %d" ,c ,a,b,(a+b));
        System.out.println();
        System.out.printf("%f",f);

        //Use Of Local
        System.out.printf(Locale.FRANCE,"France",f);
    }
}
