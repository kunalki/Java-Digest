package com.javaDigest.methods;


public class OperationsUsingMethod {
    public static void main(String[] args) {
//        String res = upperFun(" kunal pandey ");
//        System.out.println(res);
//        System.out.println(sum(4,5));
//        System.out.println(sum(8,9,10));
//        System.out.println(sum(4.5f, 8.5f));

        Cat a = new Cat();
        a.name = "bob";
        makeCatUpper(a);
        System.out.println(a.name); // BOB


    }

    public static void makeCatUpper(Cat cat){
        cat.name = cat.name.toUpperCase();

    }


//    public static String upperFun(String st){
//        return st.toUpperCase().trim();
//    }
    // Method overloading examples: Same Name with different parameters either with data type or with same data type but with different numbers
    // Many inbuilt overloaded methods are also there. As we saw for println and String class also like replace(), subString()

//    public static int sum(int a, int b){
//        return a+b;
//    }
//    public static int sum(int a, int b, int c){
//        return a + b + c;
//    }
//    public static float sum(float a, float b){
//        return a + b;
//    }




}

