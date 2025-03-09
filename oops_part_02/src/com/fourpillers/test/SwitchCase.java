package com.fourpillers.test;

import java.util.Scanner;

class SwitchCase {
    public static void main (String[] args)
    {
        System.out.println("Enter Input:");
        Scanner sc = new Scanner(System.in);
        int outer = sc.nextInt();

        switch (outer){
            case 1:
//                System.out.println("case : 1");
                int inner = sc.nextInt();
                switch (inner){
                    case 1:
                        System.out.println("outer case 1 & inner 1");
                        break;
                    case 2:
                        System.out.println("outer case 1 & inner 2");
                        break;
                    default:
                        System.out.println("outer case 1 & inner default case");
                }
            case 2 :
                System.out.println("case : 2");
                break;
            default:
                System.out.println("Default case");
        }
    }

}

