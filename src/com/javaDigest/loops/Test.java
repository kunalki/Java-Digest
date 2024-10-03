package com.javaDigest.loops;


public class Test {
    public static void main(String[] args) {


//        while loop
//    Print the table of 50 using while loop

        int n = 5;
        int i = 1;
        while(i <= 10){
            System.out.println(n*i);
            i++;
        }


        // do-while loop syntax however it is used very less.
        // first do will "do" it's work then  it goes to while although condition is not satisfied.
   /*
        int num = 50;
        int i = 1;
        do {
            System.out.println(num * i);
            i++;
        }
        while (i <= 10);
*/

        // for loop syntax for(initialisation; condition; increment/decrement)
/*
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*50);
        }

 */

//         I have to print the below. How to print??
        /*
         * 10
         * 100
         * 1000
         * 10000
         * 100000
         */

    /*
            First Method
        for(int i= 10; i <= 100000; i*=10 ){
            System.out.println(i);
        }
   */

/*

      second method, here j is for the no of rows the loop has to go and semicolon (;) to separate initialisation, condition, increment/decrement
        for(int i = 10, j = 1; j <= 6; i *= 10, j++){
            System.out.println(i);
        }


*/


/*
          third Method
        int num = 10;
        for (int i = 1; i <= 5; i++) {
            System.out.println(num);
            num *= 10;
        }
*/





    }
}
