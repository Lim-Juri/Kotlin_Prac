package com.example.prt


fun main() {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    val result = n * 12000 + k * 2000 - n / 10 * 2000
    println("$result")
}


class Solution {
    fun solution(n: Int, k: Int): Int {
        return (n * 12000) + (k * 2000) - (n / 10 * 2000)
    }
}




