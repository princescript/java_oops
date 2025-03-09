package com.fourpillers.useofstatic;

public class Utils {
    public static final double PI = 3.14;

    public static int max(int a , int b ){
        if(a > b){
            return a ;
        }
        else {
            return b;
        }
    }
    public static String trimAndUpperCase(String str) {
        if (str != null) {
           return str.trim().toUpperCase();
        } else {
            return " ";
        }
    }
}
