package com.fred.algorithm.sort;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/3/15
 */
public class QuickSort {


    /**
     * 经典排序：快速排序
     */


    private static int[] quickSort(int[] source, int left, int right) {

        if (left < right) {

            int from = left;
            int to = right;

            while (from < to) {

                if (source[from] > source[to]) {
                    int temp;
                    temp = source[from];
                    source[from] = source[to];
                    source[to] = temp;
                }
                from++;
                to--;
            }

            quickSort(source, left, from - 1);
            quickSort(source, from + 1, source.length - 1);
            //quickSort(source, to + 1, source.length - 1);
        }

        return source;
    }


    public static void main(String[] args) {
        int[] source = {5, 2456, 52, 24, 62, 20, 54, 61, 2, 3};
        printArray(quickSort(source, 0, source.length - 1));
    }


    private static void printArray(int[] array) {

        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
}
