package com.collage;

import java.util.Scanner;

public class powerof {
    public static void powerOf(int x,int n){
//        System.out.println(x^n);
        int p=1;
        for(int i=1;i<=n;i++){
            p = x*p;
        }
        System.out.println(p);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        powerOf(x,n);
    }
}
