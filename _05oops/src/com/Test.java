package com;

public class Test {
    public static void main(String[] args) {

//        String str ="abc";
//        String ans = upperFun(str);
//        System.out.println(ans); //ABC
//        System.out.println(str); //abc

//        Animal cat = new Cat();
//        cat.bride= "Cat";
//        makecatUppercase(cat);
//        System.out.println(cat.bride);

//        int result = sum(10,20,30);
//        System.out.println(result);
        System.out.println(isPrime(13));
        System.out.println(isPrime(9));

    }

    //object passing
    public  static void makecatUppercase(Animal cat){
    cat.bride = cat.bride.toUpperCase();
    }

    //sum of array
    public static int sumofArray(int[] arr){
        int sum = 0;
        for(int value : arr){
            sum+=value;
        }
        return sum;
    }
    //uppercase
    private static String upperFun(String str) {
        return str.trim().toUpperCase();
    }

    //sum of two numbers
    private static int sum(int num1, int num2){
        return  num1 + num2;
    }
    //method overloading
    private static int sum(int num1, int num2, int num3){
        return  num1 + num2 + num3;
    }

    //varargs (variable-length argument) methods
    public static int sum(int...a){
        int sum = 0;
        for(int val : a){
            sum += val;
        }
        return sum;
    }

    //is Prime
    public static boolean isPrime(int x){
        int res = 0;

        for (int i = 1; i < x/2; i++) {
        if(x % i == 0){
            res++;
        }
        }
        return res == 1;
    }

}