package com.demo;

import java.util.function.Consumer;

class Dog {
    public static void bark(String str) {
        System.out.println("狗叫："+str);
    }
}
public class FunctionReference {
    public static void main(String[] args) {
        Consumer<String> con = Dog::bark;
        con.accept("汪汪汪");

    }


}
