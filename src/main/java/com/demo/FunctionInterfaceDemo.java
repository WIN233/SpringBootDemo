package com.demo;

import java.util.function.*;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {


        Function<String,String> fun = (s)-> "s="+s;
        System.out.println(fun.apply("fdafadsfd"));

        Consumer<Integer> con = (Integer i) -> System.out.println(i);
        con.accept(11111);

        Predicate<Character> predicate = (a)-> a=='a';
        System.out.println(predicate.test('a'));


        Supplier<String> supplier = ()-> "fasdfasdf";


//        Thread thread = new Thread(() -> doSomethong());
//        thread.start();

        System.out.println(supplier.get());

    }
}
