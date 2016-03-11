package com.fred.algorithm.jd;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/3/11
 */
public class JDSetAddElement {


    public static void main(String[] args) {


        Set<String> set = new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("4");
        set.add("3");

        for (String tem : set) {

            if (tem.equals("2")) {
                set.add("5");
            }
        }

    }
}
