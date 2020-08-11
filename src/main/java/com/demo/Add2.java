package com.demo;

@FunctionalInterface
public interface Add2 {
    void add(int a, int b);

    default String getStr() {
        return "fdaafdaggg";
    }
}
