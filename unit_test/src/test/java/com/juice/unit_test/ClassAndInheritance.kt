package com.juice.unit_test

import org.junit.Test

/**
 * @author juice
 * @date 2020/09/11
 */
class ClassAndInheritance {

    @Test
    fun main() {

        println("Constructing Derived (\"hello,world\")")//1
        val d = Derived("hello", "world")
    }
}

open class Base(val name: String) {

    init {
        println("Initializing Base")//3
    }

    open val size: Int = name.length.also {
        println("Initializing size in Base: $it")//4
    }
}

class Derived(name: String, val lastName: String) :
    Base(name.capitalize().also { println("Argument for Base: $it") }) {//2

    init {
        println("Initializing Derived")//5
    }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in Derived: $it") }//6
}