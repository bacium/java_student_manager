package com.lambda;


public class LambdaCase {
    public static void main (String[] args) {
        useStringHander(new StringHander() {
            @Override
            public void printMessage (String message) {
                System.out.println("内部类     "+message);
            }
        });
        useStringHander((message)->{
            System.out.println("lambda 表达式    "+message);
        });
    }
    private static void useStringHander (StringHander StringHander){
        StringHander.printMessage("测试数据");
    }
}

interface StringHander {
    public void printMessage(String message);
}