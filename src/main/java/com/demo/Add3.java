package com.demo;

@FunctionalInterface
public interface Add3 extends Add,Add2{


    @Override
    default String getStr() {
        return null;
    }
}
