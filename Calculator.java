package com.collage;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a ,b;
        String op;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        op = sc.next();

        switch (op){
            case "+":
                System.out.println(a+b);
                break;

            case "-":
                System.out.println(a-b);
                break;

            case "*":
                System.out.println(a*b);
                break;

            case "/":
                if(b==0){
                    System.out.println("Invalid Division");
                }
                else {
                    System.out.println(a/b);
                }
                break;

            case "%":
                if(b==0){
                    System.out.println("Invalid modulo");
                }
                else {
                    System.out.println(a%b);
                }
                break;

            default:
                System.out.println("INCORRECT INPUT");
        }
    }
}
