package com.juice.kotlin_test

/**
 * @author juice
 * @date 2020/12/10
 * @desc test for String
 */
class TestString {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            testEquals("asd", "asd")
            testEquals("asD", "Asd")
        }

        private fun testEquals(a: String, b: String) {

            println("\"$a\".equals(\"$b\") = " + (a == b))
            println("\"$a\".equalsIgnoreCase(\"$b\") = " + a.equals(b, ignoreCase = true))
        }
    }
}