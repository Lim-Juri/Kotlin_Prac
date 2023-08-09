package com.example.prt


fun main() {
    val a = readLine()!!
    val result = solution(a)
    println(result.joinToString(","))
}

fun solution(my_string: String): IntArray {
    return my_string.filter { it.isDigit() }
        .map { it.digitToInt() }
        .sorted().toIntArray()
}


