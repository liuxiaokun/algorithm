package com.fred.algorithm;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @see https://leetcode.com/problems/reverse-integer/
 * @since 2016/3/14
 */
public class ReverseInteger {


    public static void main(String[] args) {
        System.out.println(test(123456789));
        System.out.println(test(-123456789));
        System.out.println(test(12000));
    }


    /**
     * 2^31-1 = 2147483647
     */
    private static Integer test(int source) {

        int symbol = 1;

        if (source < 0) {
            symbol = -1;
            source = -source;
        }
        int modNum, result = 0;

        while (source > 0) {

            modNum = source % 10;
            source = source / 10;
            result = result * 10 + modNum;
        }

        return result * symbol;
    }
}
