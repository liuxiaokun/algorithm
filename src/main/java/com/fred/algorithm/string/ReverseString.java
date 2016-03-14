package com.fred.algorithm.string;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/3/11
 */
public class ReverseString {


    public static String test(String source) {

        char[] array = source.toCharArray();

        int from = 0;
        int to = array.length - 1;

        while (from < to) {

            char tem;

            tem = array[from];
            array[from++] = array[to];
            array[to--] = tem;
        }


        return new String(array);
    }


    public static void main(String[] args) {
        System.out.println(test("123456789"));
    }
}
