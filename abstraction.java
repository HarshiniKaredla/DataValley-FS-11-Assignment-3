Abstraction in Java is a fundamental concept of object-oriented programming (OOP) that allows us to hide the complex implementation details and only show the necessary features of an object. It helps in reducing programming complexity and also increases efficiency.

There are two main ways to achieve abstraction in Java:

Abstract Classes
Interfaces

public abstract class AbstractClass { 
    int a; 
    final int b = 20; 
    static int c = 30; 
    abstract void m1();
    static void m2(){
       System.out.println("Static method in abstract class");
     }
    void m3() { 
       System.out.println("Instance method in abstract class");
    }

    AbstractClass(){
       int a = 10;
       System.out.println("Value of a; "+a);
    }

    static {
       System.out.println("Static block in abstract class");
    }
 {
 System.out.println("Instance block in abstract class");
 }

 private void m4()
 {
 System.out.println("Private method");
 }
 protected void m5()
 {
 System.out.println("Protected method");
 }
}
public class A extends AbstractClass
{
 void m1()
 {
 System.out.println("Implementation of abstract method");
 }
}
public class AbstractTest
{
 public static void main(String[] args)
 {
 A a = new A();
 System.out.println("Value of b: " +a.b);
 System.out.println("Value of c: " +AbstractClass.c);
 a.m1();
 AbstractClass.m2();
 a.m3();
 a.m5();
 }
}
