package org.example.ui;


import org.example.module.TestEmployee;

public class RunTest {

    public static void printName(String name){
        System.out.println("this is : " + name);
    }

    public static void main(String[] args) {
        TestEmployee.sayHello();
    }
}
