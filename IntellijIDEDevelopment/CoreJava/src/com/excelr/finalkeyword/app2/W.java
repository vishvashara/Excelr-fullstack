package com.excelr.finalkeyword.app2;

class W
{
    //final method cant be overrided
    final void test1()
    {
    }
    void test2()
    {
    }
}
class X extends W
{
    //void test1()
    //{
    //}
    void test2()
    {
    }
}