package com.collage;

import java.util.Scanner;

public class ConIFELSE {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = obj.nextInt();

        if(age>18){
            System.out.println("Adult");
        }
        else {
            System.out.println("Not Adult");
        }
    }
}
