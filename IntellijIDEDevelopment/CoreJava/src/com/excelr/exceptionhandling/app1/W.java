package com.excelr.exceptionhandling.app1;

class W
{
    public static void main(String[] args)
    {
        System.out.println("main begin");
        try
        {
            System.out.println("try begin");
            String s1="hello";
            System.out.println("try end");
        }
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println("from catch");
        }
        System.out.println("main end");
    }
}
