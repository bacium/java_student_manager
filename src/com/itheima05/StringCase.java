package com.itheima05;

import java.util.Scanner;

public class StringCase {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String input = sc.nextLine();
        char[] array = input.toCharArray();
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+"");
        }
    }
}
