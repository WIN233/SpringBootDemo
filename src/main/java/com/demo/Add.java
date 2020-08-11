package com.demo;

@FunctionalInterface
public interface Add {
    void add(int a,int b);

    default String getStr() {
        return "fdaf";
    }
}
