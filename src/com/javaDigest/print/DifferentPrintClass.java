package com.javaDigest.print;

import java.util.Arrays;

public class DifferentPrintClass {
    public static void main(String[] args) {
        /*

         System is a class in java.lang package in which System elated utility methods are there. And these methods interact with runtime env of System.
         Env means the infra which has been provided by the JRE. It means if we have to interact with this env then we will use the system method.
         and out is a static member of the System class which is connected to the console. Means if we have to get something printed over console then we will have to use out
         there are so many overloaded methods in System class but if we do talk about print related method there are so many overloaded println and print methods
         with one arg with different data types in System class there is one blank println() method in System class to print a blank line.
         But there us no blank method in print() method in System class
         println() method print everything in the new line means in println() method at last there is a new line character comes.
         in print() method at last there is no new line character comes it prints everything in the same line itself that too without gap.



       System.out.println(1);
        System.out.println('X');
        System.out.println("Hello");
        System.out.println(false);
        System.out.println(85.25);
        System.out.println(85.256f);
        System.out.println();
        System.out.println(1533649859);
        System.out.print(1);
        System.out.print('X');
        System.out.print("Hello");
        System.out.print(false);
        System.out.print(85.25);
        System.out.print(85.256f);

        */
//        int a = 1;
//        int b = 2;
//        String c = "Sum";

//        System.out.println("Hello" + " " + "World");
//
//        System.out.println(a + b);

//         Addition always happens from left to right. In the below statement first 1 + 2 = 3 then c = Sum so print will be 3Sum
//        System.out.println(a + b + c);
//
//         here String + integer = String therefore Sum12
//        System.out.println(c + a + b);
//
//         if I want addition to be happened first then we need to enclose the int vars in the parenthesis. As bracket precedence is higher.
//        System.out.println(c + " of " + a + " & " + b + " is " + (a + b)+".");

//         print and printf both escapes the new line character means both print in the same line without gap.
//        System.out.print(c + " of " + a + " & " + b + " is " + (a + b)+"." + "\n");
//        System.out.printf(c + " of " + a + " & " + b + " is " + (a + b)+".");
//        System.out.println("hello");
//        System.out.printf(c + " of " + a + " & " + b + " is " + (a + b)+".");
//        System.out.println();
//         let's see hoe the above printf statement can be written in different concatenation way in the down below.
//         This is what we call Format Specifiers should be used instead of String concatenation in the printf() method and it can only be used with printf() method
//         %s is placeholder of String sum and %d is placeholder of int a and int b
//        System.out.printf("%s of %d & %d: %d", c, a, b, a + b);

        // Format Specifier for String we have %s for int we have %d
        // similarly we have for char and float as well %c and %f

        char ch = 'k';
        float e = 1.2f;
        System.out.printf("the value of char and float variable is %c & %f.", ch, e);

//        int a = 5;
//        int b = 10;
//        int c = a + b;
//        System.out.printf("%d is sum of %d & %d", c, a, b); // the int var name has to be given in the same order the way we have provided int the Format Specifier.

    }
}
