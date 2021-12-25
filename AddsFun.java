package com.collage;

import java.util.Scanner;

public class AddsFun {
    public static int sum(int num1,int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        //calling sum function
        System.out.println(sum(a,b));
    }
}
