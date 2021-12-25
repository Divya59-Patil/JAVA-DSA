package com.collage;

import java.util.Scanner;

public class MultiplyFun {
    public static int calculate_product(int num1,int num2){
        int mul = num1*num2;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = calculate_product(a,b);
        System.out.println(product);
    }
}
