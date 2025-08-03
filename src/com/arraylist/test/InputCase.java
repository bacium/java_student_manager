package com.arraylist.test;

import com.arraylist.domain.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class InputCase {
    public static void main(String[] args) {
        int count=0;
        ArrayList<Student> list=new ArrayList<Student>();
        while (count>=0&&count<=4){
            count++;
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入学生"+count+"姓名");
            String name=sc.nextLine();
            System.out.println("请输入学生"+count+"年龄");
            int age=sc.nextInt();
            list.add(new Student(name,age));
        };
        System.out.println(list);
        for(Student s:list){
            System.out.println(s.getName()+"=============>"+s.getAge());
        }
    }
}
