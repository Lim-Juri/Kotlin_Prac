package com.example.prt



fun main() {
    val rep = readLine()!!.toString()
    val result = solution(rep)
    println("win : $result")
}

fun solution(rsp: String): String {
    var scissor = 2
    var rock = 0
    var paper = 5
    var all = StringBuilder()
    rsp.forEach {
        when (it.toString().toInt()) {
            scissor -> all.append(rock)
            rock -> all.append(paper)
            paper -> all.append(scissor)
        }
    }
    return all.toString()
}
//
//
//fun solution(rsp: String): String {
//    val win = when(rsp) {
//        "2" -> "5"
//        "0" -> "2"
//        "5" -> "0"
//        else -> ""
//    }
//    return win
//}
