package com.collage;

import java.util.Scanner;

public class GreaterNum {
    public static void Greater(int a,int b){
        if(a>b){
            System.out.println("A is Greater "+a);
        } else if(a<b){
            System.out.println("B is Greater "+b);
        } else {
            System.out.println("Both are equal "+a+","+b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Greater(a,b);
    }
}
