package com.driver;

public class Main {
  static class A{
      public String meth(){
          return "Invoking method from class A";
      }
  }

  static class B extends A{
      @java.lang.Override
      public String meth() {
          return "Method is overriden in Extedend class B";
      }
  }

    public static void main(String[] args) {
        A ob = new A();
        System.out.println(ob.meth());
        B obj = new B();
        System.out.println(obj.meth());

    }
}