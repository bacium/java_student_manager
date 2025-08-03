package com.arraylist.test;

import com.arraylist.domain.Student;

import java.util.ArrayList;

public class ArrayListCase {
    public static void main (String[] args) {
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("赵六", 26);
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        for (Student s : list) {
            System.out.println(s.getName() + ":" + s.getAge());
        }
        System.out.println("____________________________________");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+":"+list.get(i).getAge()+"--");
        }
    }
}


