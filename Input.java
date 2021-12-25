package com.collage;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
//        String name = sc.next(); // with one word
        String name = sc.nextLine(); // sentence

        //nextInt()
        //nextFloat()


        System.out.println(name);
    }
}
