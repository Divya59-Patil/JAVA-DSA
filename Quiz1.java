package com.collage;
import java.util.*;

//Take 2 Variable 'a' & 'b' and print their sum
public class Quiz1 {
    public static void main(String[] args) {
        System.out.println("Enter a & b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;

        System.out.println(sum);
    }
}
