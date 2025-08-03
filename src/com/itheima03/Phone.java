package com.itheima03;

public class Phone {
    private String logo;
    private int price;
    public Phone(){};
    public void setLogo(String logo){
        this.logo=logo;
    }
    public String getLogo(){
        return this.logo;
    }
    public void setPrice(int price){
       this.price=price;
    }
    public int getPrice(){
        return this.price;
    }
}
