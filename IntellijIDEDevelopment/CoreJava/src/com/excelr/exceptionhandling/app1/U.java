package com.excelr.exceptionhandling.app1;

class U
{
    public static void main(String[] args)
    {
        System.out.println("main begin");
        try
        {
            System.out.println("try begin");
            String s1=null;
            int i =s1.length();
            System.out.println("try end");
        }

        catch (NullPointerException ex)
        {
            System.out.println("from catch");
        }
        System.out.println("main end");
    }
}
