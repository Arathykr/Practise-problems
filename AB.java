class A{
      void display()
      {
          System.out.println("display");
      }
}
class B extends A{
      void think()
      {
          System.out.println("think");
      }
}
class AB
{
      public static void main(String[] args)
      {
          B b=new B();
          b.display();
          b.think();
      }
}
