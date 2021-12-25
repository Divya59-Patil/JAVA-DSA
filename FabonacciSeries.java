package com.collage;

import java.util.Scanner;

public class FabonacciSeries {
    public static void fabonacci(int n){
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for(int i=n;i>=1;i--){
            int f = a+b;
            System.out.print(f+" ");
           a = b;
           b = f;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fabonacci(7);
    }
}
