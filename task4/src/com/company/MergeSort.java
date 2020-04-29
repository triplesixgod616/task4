package com.company;

public class MergeSort {
    public static int[] mergeSort(int[] arr) {
        if (arr == null) {
            return null;
        }

        if (arr.length < 2) {
            return arr;
        }

        int [] first = new int[arr.length / 2];
        System.arraycopy(arr, 0, first, 0, arr.length / 2);

        int [] second = new int[arr.length - arr.length / 2];
        System.arraycopy(arr, arr.length / 2, second, 0, arr.length - arr.length / 2);

        first = mergeSort(first);
        second = mergeSort(second);

        return mergeArrays(first, second);
    }

    private static int[] mergeArrays(int[] first, int[] second) {
        int[] arr = new int[first.length + second.length];

        int firstIx = 0, secondIx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (firstIx == first.length) {
                arr[i] = second[secondIx];
                secondIx++;
            } else if (secondIx == second.length) {
                arr[i] = first[firstIx];
                firstIx++;
            } else if (first[firstIx] < second[secondIx]) {
                arr[i] = first[firstIx];
                firstIx++;
            } else {
                arr[i] = second[secondIx];
                secondIx++;
            }
        }

        return arr;
    }
}
