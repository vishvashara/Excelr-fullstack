package com.excelr.exceptionhandling.app2;

class J
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("from try");
        }
        catch (ArithmeticException ex)
        {
            System.out.println("from catch:"+ex);
        }
        finally
        {
            System.out.println("from finally");
        }
        System.out.println("main end");
    }
}
