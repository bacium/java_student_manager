package com.itheima03;

public class PhoneCase {
    public static void main (String[] args) {
        Phone p1=new Phone();
        p1.setLogo("小米");
        System.out.println(p1.getLogo());
        Phone p2=new Phone();
        p2.setPrice(1000);
        System.out.println(p2.getPrice());
    }

}
