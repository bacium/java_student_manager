package com.study.info.manger.controller;

import com.study.info.manger.domain.Student;
import com.study.info.manger.service.StudentService;

import java.util.Scanner;

public class StudentController {
    StudentService studentService = new StudentService();

    public void start () {
        Scanner sc = new Scanner(System.in);
        studentLoop:
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    addStudent();
                    break;
                case "2":
                   deleteStudent();
                    break;
                case "3":
                    updateStudent();
                    break;
                case "4":
                    fundAllStudent();
                    break;
                case "5":
                    System.out.println("感谢使用学生管理系统,再会!");
                    break studentLoop;
                default:
                    System.out.println("输入有误,请重新输入");
                    break;
            }
        }
    }

    private void updateStudent () {
        Scanner sc = new Scanner(System.in);
        String sid;
       while (true){
           System.out.println("请输入要修改学生的学号");
           sid = sc.next();
           boolean existFlag = studentService.sidExist(sid);
           if(existFlag){
               break;
           }else {
               System.out.println("学号不存在,请重新输入");
           }
       }
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        System.out.println("请输入地址:");
        String address = sc.next();
        Student student = new Student(sid, name, age, address);
        boolean isSuccess=studentService.updateStudent(student);
        System.out.println(isSuccess?"修改成功":"修改失败");
    }

    private void deleteStudent () {
        Scanner scanner=new Scanner(System.in);
        String sid;
       while (true) {
           System.out.println("请输入要删除学生的学号:");
            sid = scanner.next();
            boolean existFlag = studentService.sidExist(sid);
            if(existFlag){
                break;
            }else {
                System.out.println("学号不存在,请重新输入");
            }
       }
        boolean isSuccess=studentService.deleteStudent(sid);
        System.out.println(isSuccess?"删除成功":"删除失败");
    }

    private void fundAllStudent () {
        Student[] students = studentService.fundAllStudent();
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student.getSid() + "\t" + student.getName() + "\t" + student.getAge() + "\t\t" + student.getAddress());
            }
        }
    }

    private void addStudent () {

        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学号:");
            sid = sc.next();
            boolean existFlag = studentService.sidExist(sid);
            if (existFlag) {
                System.out.println("学号已存在,请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        System.out.println("请输入地址:");
        String address = sc.next();
        Student student = new Student(sid, name, age, address);
        boolean isSuccess = studentService.addStudent(student);
        if (isSuccess) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }
}
