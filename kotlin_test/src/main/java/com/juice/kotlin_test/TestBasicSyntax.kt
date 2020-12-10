package com.juice.kotlin_test

class TestBasicSyntax {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            //1、求和
//        println("sum of 3 and 5 is ${sum(3, 5)}")
//        printSum(3, 5)

            //2、求最大值
//        println("max of 0 and 42 is ${maxOf(0, 42)}")

            //3、for循环
//        forLoop()

            //4、when （java-switch）
//        println(describe(666))
//        println(describe(666L))
//        println(describe(1))
//        println(describe("张三"))


//        5、foo
//        break and continue labels
//        return at labels
            foo()

        }

        /**
         * 1、求和
         * fun sum(a: Int, b: Int) = a + b
         */
        fun sum(a: Int, b: Int): Int {
            return a + b
        }

        fun printSum(a: Int, b: Int): Unit {

            println("sum of $a and $b is ${a + b}")
        }

        /**
         * 2、求最大值
         * fun maxOf(a: Int, b: Int) = if(a > b) a else b
         * fun maxOf(a: Int, b: Int) = (a >= b) ? a : b
         */
        fun maxOf(a: Int, b: Int): Int {

            if (a > b) {
                return a
            } else {
                return b
            }
        }

        /**
         * 3、for循环
         */
        private fun forLoop() {

            val items = listOf("apple", "banana", "kiwifruit")
            for (item in items) {//foreach
                println(item)
            }
            for (index in items.indices) {
                println("item at $index is ${items[index]}")
            }
        }

        /**
         * 4、when expression
         */
        private fun describe(obj: Any): String =
            when (obj) {
                1 -> "One"
                "Hello" -> "Greeting"
                is Long -> "Long"
                !is String -> "Not a string"
                else -> "Unknown"
            }

        /**
         * 5、foo
         * break and continue labels
         * return at labels
         */
        fun foo() {

            //break and continue labels
//        loop@ for (i in 1..10) {
//            println(i)
//        }

//        loop@ for (i in 1..10) {
//            for (j in 1..10) {
//                if (i == 2 && j == 3) break@loop
//                println("i is $i,j is $j")
//            }
//        }

            //return at labels
//        listOf(1, 2, 3, 4, 5).forEach {
//            if (it == 3) return // non-local return directly to the caller of foo()
//            println(it)
//        }
//        println("this point is unreachable")

//        listOf(1, 2, 3, 4, 5).forEach lit@{
//            if (it == 3) return@lit //// local return to the caller of the lambda, i.e. the forEach loop
//            println(it)
//        }
//        println("done with explicit label")

//        listOf(1,2,3,4,5).forEach {
//            if (it == 3) return@forEach // local return to the caller of the lambda, i.e. the forEach loop
//            print(it)
//        }
//        print(" done with implicit label")

//        listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
//            if (value == 3) return // local return to the caller of the anonymous fun, i.e. the forEach loop
//            print(value)
//        })
//        print(" done with anonymous function")

            run loop@{
                listOf(1, 2, 3, 4, 5).forEach {
                    if (it == 3) return@loop // non-local return from the lambda passed to run
                    print(it)
                }
            }
            print(" done with nested loop")
        }
    }
}