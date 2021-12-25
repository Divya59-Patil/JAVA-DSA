package com.collage;

import java.util.Scanner;

public class Function1 {

    public static void printMYName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMYName(name);
    }
}
