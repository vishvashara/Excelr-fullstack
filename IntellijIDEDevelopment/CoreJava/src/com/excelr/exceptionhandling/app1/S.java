package com.excelr.exceptionhandling.app1;

class S
{
    public static void main(String[] args)
    {
        System.out.println("main begin");
        try
        {
            System.out.println("try begin");
            int i = 10/0;
            System.out.println("try end");
        }
        //
        catch (ArithmeticException ex)
        {
            System.out.println("from catch");
        }
        System.out.println("main end");
    }
}
/*
interview que:-
 how can we handle error?
ans:-error can be handle try catch block
*/