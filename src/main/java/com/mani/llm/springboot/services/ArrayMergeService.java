package com.mani.llm.springboot.services;

public class ArrayMergeService {

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[0];
        for (int value : array1) {
            mergedArray = appendElement(mergedArray, value);
        }
        for (int value : array2) {
            mergedArray = appendElement(mergedArray, value);
        }
        return mergedArray;
    }

    private static int[] appendElement(int[] array, int element) {
        int[] newArray = new int[array.length + 1];
        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = element;
        return newArray;
    }
}
