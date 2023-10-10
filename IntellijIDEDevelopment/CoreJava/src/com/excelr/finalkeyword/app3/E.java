package com.excelr.finalkeyword.app3;

class E
{
    static void test()
    {
        System.out.println("e-test");
    }
}
class F extends E
{
    static void test()
    {
        System.out.println("f-test");
    }

    public static void main(String[] args)
    {
        F f1=new F();
        f1.test();
    }
}