class B{
B(){
    System.out.println("B()");
}
{
    System.out.println("IIB");
}
public static void main (String[] args)
{
    System.out.println("main begin");
    B obj1=new B();
    System.out.println("----------");
    B obj2=new B();
    System.out.println("main end");
      
}
    
}