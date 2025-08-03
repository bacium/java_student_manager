package com.Test.StudentSys;

import com.Test.Domain.Student;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        System.out.println("--------欢迎来到学生管理系统--------");
        co:
        while (true) {
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择:");

            String choice = sc.next();
            switch (choice) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    updateStudent(list);
                    break;
                case "4":
                    detailStudent(list);
                    break;
                case "5":
                    System.out.println("退出");
                    break co;
            }
        }
    }

    private static int getIndex (ArrayList<Student> list, String sid) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSid().equals(sid)) {
                index = i;
            }
        }
        return index;
    }

    //修改学生信息
    private static void updateStudent (ArrayList<Student> list) {
        System.out.println("请输入要修改学生的学号:");
        Scanner sc = new Scanner(System.in);
        String sid = sc.next();
        int index = getIndex(list, sid);
        if (index != -1) {
            System.out.println("请输入姓名");
            String name = sc.next();
            System.out.println("请输入年龄");
            int age = sc.nextInt();
            System.out.println("请输入生日");
            String birthday = sc.next();
            Student newStudent = new Student(sid, name, age, birthday);
            list.set(index, newStudent);
        } else {
            System.out.println("学生信息不存在,请重新选择");
        }
    }

    //删除学生信息
    private static void deleteStudent (ArrayList<Student> list) {
        System.out.println("请输入要删除学生的学号:");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        int index = getIndex(list, sid);
        if (index != -1) {
            list.remove(index);
            System.out.println("删除成功");
        } else {
            System.out.println("学生信息不存在,请重新输入");
        }
        System.out.println("学号\t\t" + "姓名\t\t" + "年龄\t\t" + "生日");
        for (Student student : list) {
            System.out.println(student.getSid() + "\t" + student.getName() + "\t\t" + student.getAge() + "\t\t" + student.getBirthday());
        }
    }

    //查看学生信息
    private static void detailStudent (ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("暂无数据.请添加数据后查看");
            return;
        }
        System.out.println("学号\t\t" + "姓名\t\t" + "年龄\t\t" + "生日");
        for (Student student : list) {
            System.out.println(student.getSid() + "\t" + student.getName() + "\t\t" + student.getAge() + "\t\t" + student.getBirthday());
        }
    }

    //添加学生
    private static void addStudent (ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学号");
            sid = sc.next();
            int index = getIndex(list, sid);
            if (index == -1) {
                break;
            }
        }
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入生日");
        String birthday = sc.next();
        list.add(new Student(sid, name, age, birthday));
    }

}

