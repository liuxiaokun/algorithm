package com.fred.algorithm.sort;

import java.util.Arrays;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/3/16
 */
public class SelectSort {


    /**
     * 选择排序。
     * n 个数字，共进行 n-1 轮外循环，
     * 内循环每次选出最小的数，放到数组的最前方。
     */
    private static int[] selectSort(int source[]) {

        for (int i = 0, len = source.length; i < len - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < len; j++) {

                if (source[minIndex] > source[j]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int tem = source[i];
                source[i] = source[minIndex];
                source[minIndex] = tem;

            }

        }
        return source;
    }


    public static void main(String[] args) {
        int[] source = {5, 2456, 52, 24, 62, 20, 54, 61, 2455, 3};
        System.out.println(Arrays.toString(selectSort(source)));
    }
}
