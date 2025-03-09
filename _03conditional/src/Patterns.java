public class Patterns {

    //Table of N Numbers 🧡
    public void tableofN(int n){
        for(int i = 1 ; i <= 10; i ++){
            System.out.println(i +" x "+ n +" = "+ i*n);
        }

    }
    //Sum of N Numbers 🤍
    public static int sumofN(int n){
        int sum = 0;
        for(int i =1 ; i <= n; i++){
            sum+=i;
        }
        return  sum;
    }
    //Count Digit of N Numbers 💚
    public static void countDigits (int num){
        int result =0;
        while (num > 0){
            num = num/10;
            result++;
        }
        System.out.println("Total number of digit is = "+result);
    }
    //Factorial of N Numbers 💜
    public static  void factorialofN(int num){
        float factorial =1;
        for(int i = 1; i <= num ; i ++){
            factorial*=i;
        }
        System.out.println("Factorial is = " + factorial);
    }
    //Nested Loop 💖
    public static void nestedLoop() {
        int res=0;
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10; j++) {
                res++;
            }
        }
        System.out.println("Total loop =" + res);
    }
    //Start Pattern1 💥
    public static void startPattern1() {
        for(int i = 0; i < 6; i++){
            for (int j = 0; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /*Patterns patterns = new Patterns();
        patterns.tableofN(7);
        System.out.println(Patterns.sumofN(15));
        Patterns.countDigits(87744);
        Patterns.factorialofN(6);
        Patterns.nestedLoop();*/
        //Patterns.startPattern1();
    }
}
