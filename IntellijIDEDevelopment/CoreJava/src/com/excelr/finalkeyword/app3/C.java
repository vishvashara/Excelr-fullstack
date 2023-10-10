package com.excelr.finalkeyword.app3;

class C
{
    static void test()
    {
        System.out.println("c.test");
    }
}
class D extends C
{
    static void test()
    {
        System.out.println("d.test");
    }

    public static void main(String[] args)
    {
        D d1 =new D();
        d1.test();
    }
}
