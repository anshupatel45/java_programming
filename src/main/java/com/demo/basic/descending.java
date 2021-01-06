package main.java.com.demo.basic;

import java.util.Scanner;

public class descending
{
    public static void main (String[] arcs)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the 3 values to convert into decreasing order");
        int a=sc. nextInt();
        int b=sc. nextInt();
        int c=sc. nextInt();

        int temp;
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

}
