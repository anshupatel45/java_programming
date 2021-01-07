package main.java.com.demo.basic;

import java.util.Scanner;

public class Ascending_Descending
{
    public static void main (String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the operator you want to use");
        System.out.println("1 for Descending");
        System.out.println("2 for Ascending");

        int opt=sc.nextInt();
        while (opt<3)
        {

            System.out.println("enter 3 digit input");
            double a = sc.nextFloat();
            double b = sc.nextFloat();
            double c = sc.nextFloat();
            double temp;

            if (opt == 1)
            {
                if (b>a || c>a)
                {
                    if (c>a)
                    {
                        temp = a;
                        a = c;
                        c = temp;
                    }
                    if(b>a)
                    {
                        temp = a;
                        a = b;
                        b = temp;
                    }
                }
                if (c>b)
                {
                    temp = b;
                    b = c;
                    c = temp;
                }
                System.out.println(a + "  "+ b + "   "+ c + "   ");
            }
            if (opt == 2)
            {
                if (b<a || c<a)
                {
                    if (c<a)
                    {
                        temp = a;
                        a = c;
                        c = temp;
                    }
                    if(b<a)
                    {
                        temp = a;
                        a = b;
                        b = temp;
                    }
                }
                if (c<b)
                {
                    temp = b;
                    b = c;
                    c = temp;
                }
                System.out.println(a + "  "+ b + "   "+ c + "   ");

            }
        }
    }
}