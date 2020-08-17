package com.company;

import java.io.Console;

public class Main {

    public static void main(String[] args) {

        System.out.println("Test Sowmiyan Adding new Comment");
        //myQuickSort();

        dynamicArrayCreate();

	// write your code here
    }

    public static void myQuickSort() {
        // initialize the random size array

        int[] unsortedArray = new int[4];
        unsortedArray[0] = 23;
        unsortedArray[1] = 4;
        unsortedArray[2] = 11;
        unsortedArray[3] = 3;

        // print the values
        for (int i = 0; i < unsortedArray.length; i++) System.out.println(unsortedArray[i]);

        // Choose Pivot at random position in the array

        // choose left pointer from 0th element of an array if the pivot is not the 0th element

        // chhose the right pointer

    }

    public static void dynamicArrayCreate() {
        int dynamicArraySize = 0;

        Console sysConsole = System.console();
        if (sysConsole != null) {
            System.out.println("Please Enter the array Size in number");
            System.out.println("..............");
            String arraySize = sysConsole.readLine();
            System.out.println("Entered Value arraySize :" + arraySize);
            dynamicArraySize = Integer.parseInt(arraySize);
            int dynamicArray[] = new int[dynamicArraySize];
            for (int i = 0; i < dynamicArraySize; i++) {
              System.out.println("Please Enter [ " + i + "  ] Value :");
              String enteredNumber = sysConsole.readLine();
              System.out.println("Entered Value :" + enteredNumber);
              dynamicArray[i] = Integer.parseInt(enteredNumber);
            }

            for (int j = 0; j < dynamicArraySize; j++) {
                System.out.println("Value Stored in the Array " + dynamicArray[j]);
            }

        } else {
            System.out.println("Console not available");
        }


    }
}
