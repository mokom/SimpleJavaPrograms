package com.arrays.programs;

import java.util.Scanner;

/**
 * Description: A simple program that accepts 5 numbers from a user, creates an array, displays and sorts the array
 * @author Mokom Geh
 * @date 01/05/2021
 */

public class SortingArray {
    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        System.out.println("****** Elements in Array *******\r");
        printArray(myArray); // display myArray values

        int[] sortedArray = sortArray(myArray); // Sort values in myArray array
        System.out.println("\n****** Elements after sorting *******\r");
        printArray(sortedArray); // display sortedArray values
    }

    /**
     * This method sorts the array depending on decision choosen by user
     * @param arrayValues
     * @return the sorted array
     */

    public static int[] sortArray(int[] arrayValues) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nHow do you wish to sort");
        System.out.println("1. Ascending Order");
        System.out.println("2. Descending Order");
        String sortType = input.next();
        int temp;
        for (int i = 0; i < arrayValues.length; i++) {
            for (int j = i+1; j < arrayValues.length; j++) {
                if (sortType.equals("1")) {
                    if (arrayValues[i] > arrayValues[j]) {
                        temp = arrayValues[i]; // temp variable holds array value temporarily to handle swapping during sorting
                        arrayValues[i] = arrayValues[j];
                        arrayValues[j] = temp;
                    }
                } else {
                    if (arrayValues[i] < arrayValues[j]) {
                        temp = arrayValues[i];
                        arrayValues[i] = arrayValues[j];
                        arrayValues[j] = temp;
                    }
                }
            }
        }
        return arrayValues;
    }

    /**
     * This method get's int numbers from user and creates an array
     * @param numbers an integer
     * @return the created array
     */
    public static int[] getIntegers(int numbers) {
        int[] _array = new int[numbers];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 integer values: \r");
        for (int i = 0; i < _array.length; i++) {
            _array[i] = input.nextInt();
        }
        return _array;
    }

    /**
     * This method displays the content of an array
     * @param array
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " is " + array[i]);
        }
    }
}
