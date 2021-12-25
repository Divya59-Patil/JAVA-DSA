package com.collage;

import java.util.Scanner;

public class VoteEligibleOrNot {
    //person age is greater than 18 is eligible to vote
    public static void CheckEligibleOrNot(int age){
        if(age>=18){
            System.out.println("Person is eligible to vote");
        } else{
            System.out.println("Person is not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        CheckEligibleOrNot(age);
    }
}
