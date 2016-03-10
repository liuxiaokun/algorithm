package com.fred.algorithm;

import java.io.*;
import java.util.Arrays;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/3/10
 */
public class JDIOReadWrite {


    /**
     * 现在有1.txt, 2.txt, 3.txt 3个文件，
     * 每个文件中，都有10行数字
     * 读取3个文件中的所有数字，然后排序，
     * 然后写到 4.txt 中，每行一个数字。
     */
    public static void main(String[] args) throws IOException {

        int[] array = new int[30];

        BufferedReader bufferedReader1 =
                new BufferedReader(new InputStreamReader(new FileInputStream(new File("C://111/1.txt"))));
        String tem1;
        int i = 0;

        while ((tem1 = bufferedReader1.readLine()) != null) {
            array[i] = Integer.parseInt(tem1);
            i++;
        }
        bufferedReader1.close();

        BufferedReader bufferedReader2 =
                new BufferedReader(new InputStreamReader(new FileInputStream(new File("C://111/2.txt"))));
        String tem2;

        while ((tem2 = bufferedReader2.readLine()) != null) {
            array[i] = Integer.parseInt(tem2);
            i++;
        }
        bufferedReader2.close();

        BufferedReader bufferedReader3 =
                new BufferedReader(new InputStreamReader(new FileInputStream(new File("C://111/3.txt"))));
        String tem3;

        while ((tem3 = bufferedReader3.readLine()) != null) {
            array[i] = Integer.parseInt(tem3);
            i++;
        }
        bufferedReader3.close();

        Arrays.sort(array);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C://111/4.TXT"));

        for (int temp : array) {
            bufferedWriter.write(temp + "\n");
        }

        bufferedWriter.close();

    }
}
