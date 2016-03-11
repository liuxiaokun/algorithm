package com.fred.algorithm.jd;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/3/10
 */
public class JDYuanWills {

    /**
     * 要求：
     * 输入 54.12， 输出 54.12
     * 输入 54.10， 输出 54.1
     * 输入 54.00， 输出 54
     */
    public static String test(String source) {

        char[] chars = source.toCharArray();
        int n = chars.length - 1;

        while (chars[n] == '0') {
            n--;
        }
        if (chars[n] == '.') {
            n--;
        }

        return new String(chars, 0, n + 1);
    }

    public static void main(String[] args) {
        System.out.println(test("54.12"));
        System.out.println(test("54.10"));
        System.out.println(test("54.00"));
    }
}
