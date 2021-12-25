package com.collage;
import java.util.*;

public class PrintAverage {
    public static float print(int n1,int n2,int n3){
        float avg = (n1+n2+n3)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println(print(n1,n2,n3));
    }
}
