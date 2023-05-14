package com.driver;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        B check = new B();
        check.meth();
        check.meth();
    }

    public static class B extends A {
        public B() {
        }

        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static class A {
        public A() {
        }

        public String meth() {
            return "Invoking method from class A";
        }
    }
}