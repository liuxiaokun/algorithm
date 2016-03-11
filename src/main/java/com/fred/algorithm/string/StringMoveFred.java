package com.fred.algorithm.string;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/3/11
 */
public class StringMoveFred {


    /**
     * 给定一个字符串，要求将字符串前面的若干个字符移动到字符串的尾部。
     * eg： 将abcdef的前3个字符a, b, c 移动到字符串的尾部
     * 原来字符串将变为defabc
     */
    public static void main(String[] args) {

        System.out.println(test("abcdef", 1));
        System.out.println(test("abcdef", 2));
        System.out.println(test("abcdef", 3));
        System.out.println(test("abcdef", 4));
        System.out.println(test("abcdef", 5));
        System.out.println(test("abcdef", 6));
    }


    private static String test(String source, int n) {

        char array[] = source.toCharArray();
        int length = array.length;

        while (n > 0) {
            char firstChar = array[0];

            for (int i = 1; i < length; i++) {
                array[i - 1] = array[i];
            }
            array[length - 1] = firstChar;
            n--;
        }
        return new String(array);
    }


}
