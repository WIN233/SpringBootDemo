package com.demo;

public class Test {
    public static void main(String[] args) {

        Add3 add = (a,b) ->
            System.out.println("hhhhhhhh"+a+","+b);

        add.add(1,2);
        System.out.println(add.getStr());
    }
}
