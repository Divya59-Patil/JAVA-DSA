package com.collage;

import java.util.Scanner;

public class EvenOddFunc {
    public static void Check(int n){
        if(n%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Check(n);
    }
}
