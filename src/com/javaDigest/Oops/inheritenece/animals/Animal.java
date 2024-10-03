package com.javaDigest.Oops.inheritenece.animals;


public class Animal {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("This animal eats food.");
    }

    // All the properties & methods that animal has Dog is inheriting them along with that Dog has some of its own property as well
    // the way this sayHello method is being overridden by the Dog class with its own property.
    public void sayHello(){
        System.out.println("");
    }
}

