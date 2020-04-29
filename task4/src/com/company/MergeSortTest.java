package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class MergeSortTest {
    int[] testArray;

    private void fillRndNum(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt();
        }
    }

    @Test
    public void testMergeSort() {
        for(int i = 0; i < 1000; i++) {
            testArray = new int[new Random().nextInt(100000)];
            int[] testData = testArray.clone();

            Arrays.sort(testData);
            testArray = MergeSort.mergeSort(testArray);

            Assert.assertArrayEquals(testData, testArray);
        }
    }
}
