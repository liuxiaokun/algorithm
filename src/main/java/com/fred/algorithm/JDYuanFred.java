package com.fred.algorithm;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/3/10
 */
public class JDYuanFred {


    /**
     * 要求：
     * 输入 54.12， 输出 54.12
     * 输入 54.10， 输出 54.1
     * 输入 54.00， 输出 54
     */
    public static String test(String source) {


        char[] array = source.toCharArray();
        int length = array.length;
        int sub = 0;

        if (array[length - 1] == '0') {

            if (array[length - 2] == '0') {
                sub = 3;
            } else {
                sub = 1;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0, len = length - sub; i < len; i++) {
            stringBuilder.append(array[i]);
        }

        return stringBuilder.toString();
    }


    public static void main(String[] args) {


        System.out.println(test("54.12"));
        System.out.println(test("54.10"));
        System.out.println(test("54.00"));
    }

}
