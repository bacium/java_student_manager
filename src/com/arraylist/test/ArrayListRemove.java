package com.arraylist.test;

import java.util.ArrayList;

public class ArrayListRemove {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("t");
        list.add("t");
        list.add("t");
        list.add("t");
        list.add("c");
        list.add("c");
        for (int i = 0; i < list.size(); i++) {
            String str=list.get(i);
            if("a".equals(str)){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
