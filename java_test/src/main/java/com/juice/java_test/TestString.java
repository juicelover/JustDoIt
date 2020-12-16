package com.juice.java_test;

/**
 * @author juice
 * @desc String 知识点
 */
public class TestString {

    public static void main(String[] args) {

        testEquals("asd", "asd");
        testEquals("asD", "Asd");
    }

    /**
     * @see java.lang.String#equalsIgnoreCase
     * usage: checking vertification code
     */
    private static void testEquals(String a, String b) {

        System.out.println("\"" + a + "\".equals(\"" + b + "\") = " + a.equals(b));
        System.out.println("\"" + a + "\".equalsIgnoreCase(\"" + b + "\") = " + a.equalsIgnoreCase(b));
    }
}