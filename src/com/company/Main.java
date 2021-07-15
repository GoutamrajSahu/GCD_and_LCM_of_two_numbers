package com.company;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input 2 numbers to find the DCD and LCM: ");
        int num = Sc.nextInt();
        int num1 = Sc.nextInt();
        int GCD = 0, LCM = 0;
        for(int i = 1; i<=num && i<=num1; i++)
        {
            if(num % i == 0 && num1 % i ==0){
                GCD = i;
            }
        }
        System.out.println("GCD is "+GCD);
        LCM = (num*num1)/GCD;
        System.out.println("LCM is "+LCM);
    }
}