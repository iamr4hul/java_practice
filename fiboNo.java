package com.rahul_practice;

import java.util.Scanner;

        //  Q-1 find the fibonacci number series to find the number at the nth place

public class fiboNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a= 0;
        int b= 1;
        int count = 2;
        while (count<=n){

            int temp = b;
            b = b+a;
            a=temp;
            count++;
        }

        System.out.println(b);

    }
}
