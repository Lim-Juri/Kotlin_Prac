package com.example.lv2_calculator

import java.lang.Exception

//레벨1,2
fun main() {

    val calculator = "계산기"

    var a = inputMyInfo("a").toString().toInt()

    var op = inputMyInfo("op").toString()

    var b = inputMyInfo("b").toString().toInt()

    var result:Int=0

    if (op == "+") {
        result = a + b
    } else if (op == "-") {
        result = a - b
    } else if (op == "/") {
        result = a / b
    } else if (op == "*") {
        result = a * b
    }
    else {
        println("연산자를 다시 입력해 주세요.")
    }
    displayInfo(calculator, a, op, b, result)

}


fun displayInfo(calculator:String, a:Int, op:String, b:Int, result:Int) {
    println("========${calculator}========")
    println("${a} ${op} ${b} = ${result}")
    println("계산 끝.")
}


fun inputMyInfo(type:String): Any? {
    return when(type) {
        "a" -> {
            println("숫자를 입력해주세요.")
            while (true) {
                try {
                    var origina:String? = readLine()
                    return  origina?.toInt() ?: -1
                } catch (e:Exception) {
                    println("숫자를 다시 입력해주세요.")
                }
            }
        }
        "op" -> {
            println("연산자를 입력해주세요.")
            while (true) {
                try {
                    var originop:String?= readLine()
                    if (originop?.equals("+")==true || originop?.equals("-")==true
                        || originop?.equals("*")==true || originop?.equals("/")==true){
                        return originop
                    } else {
                        println("다른 연산자를 입력해주세요.")
                    }
                } catch (e:Exception) {
                    println("다른 연산자를 입력해주세요.")
                }
            }
        }
        "b" -> {
            println("숫자를 입력해주세요.")
            while (true){
                try {
                    var origina:String? = readLine()
                    return  origina?.toInt() ?: -1
                } catch (e:Exception) {
                    println("숫자를 다시 입력해주세요.")

                }
            }
        }
        else -> {
            return "no"
        }
    }
}
