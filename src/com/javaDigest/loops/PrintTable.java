package com.javaDigest.loops;


public class PrintTable {
    public static void main(String[] args) {
        // print 50 table using for loop

        // int num = 50;
//        for(int i =1; i <= 10; i++){
//            System.out.println(num +" * "+ i +" = " +(num*i));
//        }

        // print table of 50 using while loop
//        int num = 50;
//        int i = 1;
//        while( i <= 10){
//            System.out.println(num +" * " + i +" = " +(num*i));
//            i++;
//        }

//        int i = 1;
//        int num = 50;
//        do {
//            System.out.println(num * i);
//            i++;
//        } while (i <= 10);


//     Factorial of a number
        int num = 10; // 6 *  5 * 4 * 3 * 2 *1
        int rem = 1;
        while (num > 0) {
            rem = rem * num;
            num--;
        }
        System.out.println(rem);



/*

 This pattern has to be printed below.
        *
        **
        ***
        ****
        *****
        ******
        *******
*/

        for( int i = 0; i < 10; i++){ // it is deciding how many times loop will run // basically the number of rows
            for ( int j = 0; j <= i; j++){ // and for each row it will print if j = 0 and j < 10 means for each row this loop will run 0 to 9 means 100 times it will print 0 to 100.
                System.out.print("*");
            }
            System.out.println();
        }

        int i = 1;
        while ( i <= 1000 ){
            System.out.println(i);
            if( i == 500 ){
                break;
            }
            i++;
        }




/*
          I want except 5 everything to be printed.  continue
        int i = 1;
        while( i <= 10 ){
            if( i == 5 ){
                i++;
             continue; // here it means when i = 5 then instead of going to the print statement and increment it should go to the while condition/iteration again but increment is needed here.
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Hi Kunal");
*/

//        ======================= or ==================


/*

        int i = 1;
        while( i <= 10 ){
           if( i != 5 ){
               System.out.println(i);
           }
            i++;
        }

*/

    }
}


//package com.loops;
//
//import java.util.Scanner;
//
//public class TwoTable {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter the number you want to print the table of: ");
//        int n = sc.nextInt();
//
//        // Call the printTable function to print the entire table
//        printTable(n);
//
//        // Get the last value of the table and print it
//        int tablePrintkaro = printLastTableValue(n);
//        System.out.println("Last value of the table: " + tablePrintkaro);
//    }
//
//    // Method to print the multiplication table
//    static void printTable(int n) {
//        for(int i = 1; i <= 10; i++) {
//            System.out.println(n + " x " + i + " = " + (n * i));
//        }
//    }

// Method to return the last value of the table
//    static int printLastTableValue(int n) {
//        return n * 10; // The last value is always n * 10
//    }
//}
