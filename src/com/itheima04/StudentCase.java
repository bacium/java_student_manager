package com.itheima04;

public class StudentCase {
    public static void main (String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(20);
        System.out.println(s1.getName() + "..." + s1.getAge());
        Student s2 = new Student("李四", 30);
        s2.show();
    }

}
