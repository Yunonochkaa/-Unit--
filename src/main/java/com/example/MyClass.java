package com.example;

public class MyClass {
    public String concat(String a, String b) {
        if (a == null) {
            a = "null";
        }
        if (b == null) {
            b = "null";
        }
        return a + b;
    }
}