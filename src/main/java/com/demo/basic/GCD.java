package main.java.com.demo.basic;

import java.util.*;
class GCD
{
    public static void main(String[] arcs)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number n1 = ");
        System.out.println("enter the number n2 = ");

        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1>0 && n2>0)
        {
            int ans=gcd(n1,n2);
            System.out.println("gcd is "+ans);
        }
        else
        {
            System.out.println("enter the value greater than zero");
        }
    }
    static int gcd ( int a , int b )
    {
        while(b>0)
        {

            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}

