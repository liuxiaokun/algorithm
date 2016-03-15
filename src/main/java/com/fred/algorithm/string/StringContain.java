package com.fred.algorithm.string;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/3/15
 */
public class StringContain {


    /**
     * 给定一个长字符串和一个短字符串
     * 如何快速的判断短字符串中的所有字符是否都在长字符串中？
     * <p/>
     * eg. ABCD   BAD   true
     * eg. ABCD   BCE   false
     * eg. ABCD   AA    true
     */
    private static boolean test(String longStr, String shortStr) {

        char[] longChar = longStr.toCharArray();
        char[] shortChar = shortStr.toCharArray();


        for (int i = 0, iLen = shortChar.length; i < iLen; i++) {

            boolean jContain = false;

            for (int j = 0, jLen = longChar.length; j < jLen; j++) {


                if (shortChar[i] == longChar[j]) {
                    jContain = true;
                    break;
                }
            }

            if (!jContain) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(test("ABCD", "BAD"));
        System.out.println(test("ABCD", "BCE"));
        System.out.println(test("ABCD", "AA"));
    }
}
