package com.rahul_practice;


import java.util.Scanner;

public class conditions_Question {

    public static void main(String[] args) {

        /*
        Q.1
            if someone has salary of more than 10000 then give the bonus to them of 1000 rs and if someone have
            Salary of more than 20000 then give the bonus to them of 2000 ? NOW write the code for this!
         */


       /*
      ANSWER :
      Scanner sl = new Scanner(System.in);
      float salary = sl.nextFloat();
      if(salary>10000){
          salary += 1000; // salary = salary + 1000;
          System.out.println("hi,ur salry is :" + salary);

      } if (salary<20000){
          salary -= 5000;
          System.out.println("hello,ur salary is : " + salary);

      } else{
          System.out.println("you dont have any increment");
      }
     */

        /*
         Q.2
             Student have 5 subjects and each subject have marks out of 100 and then make a program to tell
              the total marks and percentage? take the input from user!
         */

       //Answer :
       Scanner st = new Scanner(System.in);

        System.out.print("ur Hindi marks : ");
        int Hindi = st.nextInt();
        System.out.print("ur en marks : " );
        int En = st.nextInt();
        System.out.print("ur sc marks : " );
        int sc = st.nextInt();
        System.out.print("ur math marks : " );
        int math = st.nextInt();     // in any input we can convert  int into float after that the result of sum will be in float ,ex : float math = st.nextInt();
     System.out.println(math);      //After that user don't need to write float/f in the result of percentage like = it can also be written as :(Hindi + En  + sc + math  + sst) / 500*100
        System.out.print("ur sst marks : " );
        int sst = st.nextInt();

        float totalMarks = Hindi + En + sc + math + sst;
        System.out.println("ur marks is : " + totalMarks);

         float prcntage = ((totalMarks) / 500*100); //it can also be written as :(Hindi + En  + sc + math  + sst) / 500f*100
        System.out.println("ur percentage is : " + prcntage );







    }
}
