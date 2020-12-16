package com.juice.java_test;

/**
 * @author juice
 * @date 2020/12/16
 * @desc Number 知识点
 */
public class TestNumber {

    public static void main(String[] args) {

        change(3, 5);
        change(-3, -5);
        change(3, -5);
        change(-3, 5);
    }

    /**
     * 在不创建第三个变量的前提下 调换 a 和 b 的内容
     */
    private static void change(int a, int b) {

        System.out.println("\norigin:a=" + a + ",b=" + b);
        a += b;//a = a + b
        b = a - b;
        a -= b;//a = a - b
        System.out.println("change:a=" + a + ",b=" + b);
    }
}
