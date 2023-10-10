package com.excelr.exceptionhandling.app2;

import java.util.Scanner;

class H
{
    public static void main(String[] args)
    {
        System.out.println("Enter a sentence! ");
        String s1=new Scanner(System.in).nextLine();
        try
        {
            System.out.println("try begin");
            int i = Integer.parseInt(s1);
            System.out.println("+++++++");
            int K = i / 0;
            System.out.println("try end");
        }
        catch (NumberFormatException ex2)
        {
            System.out.println("from catch:" +ex2);

        }
        finally
        {
            System.out.println("from finally");
        }
        System.out.println("main end");
    }
}
/*
Interview que
Q= what is finally block?
   weather exception is there or not,raised exception is handled or not but
   finally block will executed.
*/