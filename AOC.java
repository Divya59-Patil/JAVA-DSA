package com.collage;

import java.util.*;

public class AOC {
    //area of a circle
    public static void main(String[] args) {
        int r;
        double aoc;
        System.out.println("Enter radius ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();

        aoc = (3.14) * (r*r);

        System.out.println(aoc);
    }
}
