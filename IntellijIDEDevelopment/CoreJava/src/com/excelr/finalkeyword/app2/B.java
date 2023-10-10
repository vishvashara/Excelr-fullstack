package com.excelr.finalkeyword.app2;

class B
{
    final int x;

    B()
    {
        x=100;
    }
    B(int i)
    {
        x=10;
    }

    public static void main(String[] args)
    {
        B b1=new B();
        B b2=new B(100);
        System.out.println(b1.x);
        System.out.println(b2.x);
    }
}

