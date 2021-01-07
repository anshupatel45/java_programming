package main.java.com.demo.basic;
import java.util.*;
public class SwitchCase {
    public static void main (String []args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("plz enter command------> start or stop");
        String text = sc.nextLine();

        switch (text){
            case "start":
                System.out.println("machine started");
                break;

            case "stop":
                System.out.println("machine stoped");
                break;
            default:
                System.out.println("plz enter proper command");

        }

    }

}