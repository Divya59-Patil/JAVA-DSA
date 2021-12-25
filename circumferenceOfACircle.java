package com.collage;

import java.util.Scanner;

public class circumferenceOfACircle {
    //formula of circumference of a circle = 2*3.14*redius;
    public static void coc(int r){
        double c = 2*3.14;
        double circumference = c*r;
        System.out.println(circumference);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        coc(r);
    }
}
