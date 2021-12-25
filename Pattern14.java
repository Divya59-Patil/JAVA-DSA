package com.collage;

public class Pattern14 {
    public static void main(String[] args) {
        int n=4;
        //row
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //1 half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //2half
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //1 half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //2half
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
