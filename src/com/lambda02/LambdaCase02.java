package com.lambda02;

import java.util.Random;

public class LambdaCase02 {
    public static void main(String[] args) {
        useRandomNumHander(new RandomNumHander() {
            @Override
            public int getNumber () {
                Random result = new Random();
               int re=result.nextInt(10)+1;
                System.out.println(re+"==========11111111111");
             return re;
            }
        });
        useRandomNumHander(()->{
            Random result = new Random();
            int re=result.nextInt(10)+1;
            System.out.println(re+"===========222222222222");
            return re;
        });
    }
    private static void useRandomNumHander (RandomNumHander RandomNumHander){
         RandomNumHander.getNumber();
    }
}

interface  RandomNumHander{
     int getNumber();
}