package com.collage;

public class InfiniteLoop {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println(1);
            i++;
        }while (true);
    }
}
