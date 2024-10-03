package com.javaDigest.Oops.abstraction;

public abstract class Animal {

    private String name;
    private int age;
    private boolean hasSuperPower;

    // Abstract class can be constructed if we need any initial setup like hasSuperPower instance variable.
    protected Animal(){
        this.hasSuperPower = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void sayHello(); // abstract method

    public void sleep(){
        System.out.println("zzz..."); // concrete method
    }
}