package com.fred.algorithm.sort;

import java.util.Arrays;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/3/16
 */
public class BubbleSort {


    /**
     *  n 个数字的冒泡排序
     * 一共需要 n-1 次外循环，每一次外循环得到一个最大值，放到数组的后边。
     * 内循环： m 个数就需要比较 m-1 次。
     */
    private static int[] bubbleSort1(int[] source) {


        for (int i = 1, iLen = source.length; i < iLen; i++) { //外循环的次数


            for (int j = 0; j < iLen - i; j++) {

                if (source[j] > source[j + 1]) {
                    int tem;
                    tem = source[j + 1];
                    source[j + 1] = source[j];
                    source[j] = tem;
                }
            }//inner loop

        }//outer loop
        return source;
    }


    private static int[] bubbleSort2(int[] source) {


        for (int i = 0, iLen = source.length; i < iLen - 1; i++) {

            for (int j = i; j < iLen - 1; j++) {

                if (source[i] > source[j + 1]) {
                    int tem;
                    tem = source[j + 1];
                    source[j + 1] = source[i];
                    source[j + 1] = tem;
                }
            }//inner loop

        }//outer loop
        return source;
    }
    public static void main(String[] args) {
        int[] source = {5, 2456, 52, 24, 62, 20, 54, 61, 2455, 3};
        System.out.println(Arrays.toString(bubbleSort1(source)));
        System.out.println(Arrays.toString(bubbleSort2(source)));
    }
}
