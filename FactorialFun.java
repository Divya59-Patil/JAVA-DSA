package com.collage;

import java.util.Scanner;

public class FactorialFun {
    //n! = n*(n-1)*(n-2).....1
    public static void factorialOfNum(int num){
        if(num<0){
            System.out.println("Invalid Number");
            return;
        }
        int fac = 1;
        for (int i=num;i>=1;i--){
            fac = i*fac;
        }
        System.out.println(fac);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        factorialOfNum(a);
    }
}
