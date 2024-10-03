package com.javaDigest.constructors;

public class Student {

    private String name;
    private int age;
    private int rollNumber;

// Constructor is a special method which is used to initialize the objects. And This method is used when we create any object. And it helps
//    in setting the initial values.
    // I created a constructor where I override the value of the default instance variable. and as soon as we create our own constructor
    // the default constructor stops working.
    // This is overloaded constructor. like default. means without creating this constructor and without initializing
    // the value of the instance variable in this constructor and without setting value of the instance variable using set method as we have in this class
    // if we do print them we will get the default value of that instance variable based on the data type used in that.
//    public Student(){
//        this.age = 10;
//    }

    // Now I create parameterized constructor. while creating the instance of the Student class we can pass the value of
    // the local vars to the constructor by the  instance variables of the class.
    // Note: Now while creating the instance of this class if we don't pass the values these vars we will get the error.
    // To summarize --> The local vars to this constructor is being initialized by the instance variables.
    // And these values that we compulsorily pass while creating instance become the default value until we set either using set method if any or
    // if we set using the reference var of the instance if the filed is not private then only it will let use set the value outside of the class.
    public Student(String name, int age, int rollNumber){
        this.name = name; // this.name means instance variable of the class.
        // here we can pass the condition as well that if the age is negative then return 0 and all the way we are doing in set method of the filed.
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // constructor overloading, suppose we have different Student instance where we have to pass only name we can.
    public Student(String name){
        this.name = name;
    }
    public Student(int age){
        this.age = age;
    }
    // But here we can not overload one more constructor for rollNumber because that is also a type of int. And in overloading that is not allowed.


    public void setAge(int age){
        if( age < 0){
            age = 0;
        }
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setRollNumber(int rollNumber){
        if(rollNumber < 0){
            System.out.println("Invalid ROll Number");
        }else{
            this.rollNumber = rollNumber;
        }
    }
    public int getRollNumber(){
        return this.rollNumber;
    }



}
