package com.collage;

import java.util.Scanner;

public class PrimeOrNotFun {
    public static void CheckNumPrime(int n){
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.println("Non-Prime");
                return;
            }
            else{
                System.out.println("Prime");
                return;
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CheckNumPrime(n);
    }
}
