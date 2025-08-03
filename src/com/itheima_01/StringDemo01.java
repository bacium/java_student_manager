package com.itheima_01;

/*
    String类表示字符串。 Java程序中的所有字符串文字（例如"abc" ）都实现为此类的实例

    构造方法：
        String()：初始化新创建的 String对象，使其表示空字符序列
        String(String original)：初始化新创建的String对象，使其表示与参数相同的字符序列
 */
public class StringDemo01 {
    public static void main(String[] args) {
        //String()：初始化新创建的 String对象，使其表示空字符序列
        String s1 = new String();
        System.out.println(s1);
        //int length() 返回此字符串的长度
        System.out.println(s1.length());
        System.out.println("------------");

        //String(String original)：初始化新创建的String对象，使其表示与参数相同的字符序列
        String s2 = new String("itheima");
        System.out.println(s2);
        System.out.println(s2.length());
        System.out.println("------------");

        //Java程序中的所有字符串文字（例如"abc" ）都实现为此类的实例
        String s3 = "itheima";
        System.out.println(s3);
        System.out.println(s3.length());
    }
}
