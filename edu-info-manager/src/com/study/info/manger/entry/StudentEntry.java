package com.study.info.manger.entry;

import com.study.info.manger.controller.StudentController;

import java.util.Scanner;

public class StudentEntry {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    StudentController studentController=new StudentController();
                    studentController.start();
                    break;
                case "2":
                    System.out.println("老师管理");
                    break;
                case "3":
                    System.out.println("退出");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误,请重新输入");
            }
        }
    }

}
