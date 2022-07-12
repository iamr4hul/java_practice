package com.rahul_practice;

import java.util.Scanner;

public class ques_practice {
    public static void main(String[] args) {

        //Q-1 Take the input from user of three numbers and tell him the largest number?

//        Scanner sc = new Scanner(System.in);
//         int a  = sc.nextInt();
//         int b  = sc.nextInt();
//         int c  = sc.nextInt();

          // 1st method to solve this
//         int max = a;
//         if(b>max){
//             max = b;
//         } if(c>max) {
//             max = c;
//        }
//        System.out.println(max);



        // 2nd method to solve this statement
        // very easy method;
//        int max = Math.max(c ,Math.max(a,b));
//
//        System.out.println(max);



        // character value print;

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(1); //for print the char value we should write like thiss
         if(ch>='a' && ch<='z' ) {
             System.out.println("lowercase");
         }else{
             System.out.println("Uppercase");
         }
       // System.out.println(ch);

//        String word = "rahul";
//        System.out.println(word.charAt(3));






    }
}
