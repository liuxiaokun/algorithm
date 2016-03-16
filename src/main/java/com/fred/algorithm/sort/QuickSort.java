package com.fred.algorithm.sort;

import java.util.Arrays;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/3/15
 */
public class QuickSort {


    /**
     * 经典排序：快速排序
     */


    private static int[] quickSort(int[] s, int left, int right) {

        if (left < right) {

            int i = left, j = right, x = s[i];

            while (i < j) {

                while (i < j && x <= s[j]) {
                    j--;
                }
                s[i] = s[j];

                while (i < j && s[i] <= x) {
                    i++;
                }
                s[j] = s[i];
            }
            s[i] = x;

            quickSort(s, left, i - 1);
            quickSort(s, i + 1, right);
        }

        return s;

    }


    public static void main(String[] args) {
        int[] source = {5, 2456, 52, 24, 62, 20, 54, 61, 2455, 3};
        System.out.println(Arrays.toString(quickSort(source, 0, source.length - 1)));
    }


}
