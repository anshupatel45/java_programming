package main.java.com.demo.basic;

import java.util.*;

public class Calculator
{
    public static void main (String []args)
    {

        double answer=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the operator you want to use");
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");
        System.out.println("5 for modulo");
        int opt=sc.nextInt();
        while (opt<6)
        {

            System.out.println("enter 2 digit input");

            double i = sc.nextFloat();
            double j = sc.nextFloat();


            if (opt == 1) {
                answer = i + j;
            }
            if (opt == 2) {
                answer = i - j;
            }
            if (opt == 3) {
                answer = i * j;
            }
            if (opt == 4) {
                answer = i / j;
            }
            if (opt == 5) {
                answer = i % j;
            }
            System.out.print("your answer is -------->" + answer);
        }
    }
}

