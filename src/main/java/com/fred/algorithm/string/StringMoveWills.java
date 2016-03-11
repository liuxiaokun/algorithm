package com.fred.algorithm.string;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/3/11
 */
public class StringMoveWills {


    public static String test(String code, int n) {

        char[] chars = code.toCharArray();
        int length = chars.length;

        int times;
        int defaultLength;

        int gcd = gcd(length, n);
        if (gcd != 1) {
            times = gcd;
            defaultLength = length / gcd - 1;
        } else {
            times = 1;
            defaultLength = length - 1;
        }

        for (int m = 0; m < times; m++) {
            int i = m;
            char t = chars[i];
            int p = defaultLength;
            while (p-- > 0) {
                int j = (i + n) % length;
                chars[i] = chars[j];
                i = j;
            }
            chars[i] = t;
        }

        return new String(chars);
    }

    /**
     * 最大公约数
     */
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }


    public static void main(String[] args) {
        System.out.println(test("abcdef", 1));
        System.out.println(test("abcdef", 2));
        System.out.println(test("abcdef", 3));
        System.out.println(test("abcdef", 4));
        System.out.println(test("abcdef", 5));
        System.out.println(test("abcdef", 6));
    }

}
