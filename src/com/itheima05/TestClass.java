package com.itheima05;

public class TestClass {
    public static void main (String[] args) {
        Person01 s1 = new Person01();
        s1.sayHello();
    }
}


abstract class Person05 {
    protected String name;
    protected int age;

    public abstract void sayHello () ;
}

class Person01 extends Person05 {
    @Override
    public void sayHello () {
        System.out.println("这是复写的方案");
    }
}

