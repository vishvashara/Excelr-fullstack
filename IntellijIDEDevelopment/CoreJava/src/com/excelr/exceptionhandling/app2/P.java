package com.excelr.exceptionhandling.app2;

class P
{
    public static void main(String[] args)
    {
        System.out.println("main begin");
        try
        {
            System.out.println("from try begin");
            int i=10/0;
            System.out.println("from try end");
        }
        catch (ArithmeticException ex)
        {
            System.out.println("from catch:"+ex);
            Runtime.getRuntime().exit(0);
        }
        finally
        {
            System.out.println("from finally");
        }
        System.out.println("main end");
    }
}
