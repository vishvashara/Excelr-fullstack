package com.excelr.finalkeyword.app2;

class P
{
    final int i;

    P()
    {
        i=10;
    }
    P(boolean b)
    {
        i=20;
    }

    public static void main(String[] args)
    {
        P p1=new P();
        P p2=new P(true);
        System.out.println(p1.i);
        System.out.println(p2.i);
    }
}
