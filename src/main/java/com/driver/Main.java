package com.driver;

public class Main {
    static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        // Calling method from class A
        System.out.println(objA.meth());

        // Calling overridden method from class B
        System.out.println(objB.meth());
    }
}