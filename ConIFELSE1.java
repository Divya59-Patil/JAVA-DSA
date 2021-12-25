package com.collage;

import java.util.Scanner;

public class ConIFELSE1 {
    public static void main(String[] args) {
        int a , b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

//        if(a==b){
//            System.out.println("Equal");
//        } else if(a>b){
//            System.out.println("a is Greater");
//        }
//        else {
//            System.out.println("a is lesser");
//        }

        if(a==b){
            System.out.println("Equal");
        }
        else {
            if(a>b){
                System.out.println("a is greater");
            }
            else {
                System.out.println("a is lesser");
            }
        }
    }
}
