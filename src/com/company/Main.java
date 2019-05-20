package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[] values = getIntegers(5);
        sortArray(values);
        printArray(values);

    }

    public static int[] getIntegers(int num) {
        int[] getArray = new int[num];
        System.out.println("Enter values\r");
        for (int i = 0; i < getArray.length; i++) {
            getArray[i] = scanner.nextInt();
        }
        return getArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " is " + array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        int[] sortArray = new int[array.length];
        for (int i = 0; i < sortArray.length; i++) {
            sortArray[i] = array[i];
        }
        //int[] sortedArray = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;

            for (int i = 0; i < sortArray.length-1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }

        }
        return sortArray;
    }
}