package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class MergeSortTest {
    @Test
    public void normalTestMergeSort() {
        int[] testArray = {1, 231, 23, 3, 12, 0, -12, 2, 3, 41, 12, 18, 23, 41, 15};
        int[] testData = testArray.clone();

        Arrays.sort(testData);
        testArray = MergeSort.mergeSort(testArray);

        Assert.assertArrayEquals(testData, testArray);
    }

    @Test
    public void smallTestMergeSort() {
        int[] testArray1 = {};
        int[] testData1 = testArray1.clone();
        int[] testArray2 = {1};
        int[] testData2 = testArray2.clone();
        int[] testArray3 = {2, 1};
        int[] testData3 = testArray3.clone();
        int[] testArray4 = {3, 1, 2};
        int[] testData4 = testArray4.clone();
        Assert.assertArrayEquals(testData1, testArray1);
        Assert.assertArrayEquals(testData2, testArray2);
        Assert.assertArrayEquals(testData3, testArray3);
        Assert.assertArrayEquals(testData4, testArray4);
    }

    @Test
    public void testMergeSortWithSortArr() {
        int[] testArray = {1, 231, 23, 3, 12, 0, -12, 2, 3, 41, 12, 18, 23, 41, 15};
        int[] testData = testArray.clone();

        Arrays.sort(testData);
        Arrays.sort(testArray);
        testArray = MergeSort.mergeSort(testArray);

        Assert.assertArrayEquals(testData, testArray);
    }
}
