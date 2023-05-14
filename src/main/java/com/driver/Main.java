package com.driver;

public class Main {
  public static class A{
      public String meth(){
          return "Invoking method from class A";
      }
  }

  public static class B extends A{
      @java.lang.Override
      public String meth() {
          return "Method is overriden in Extedend class B";
      }
  }

    public static void main(String[] args) {
        B ob = new A();
        ob.meth();
        B obj = new B();
        obj.meth();

    }
}