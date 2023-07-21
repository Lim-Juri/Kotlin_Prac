package com.example.calculator.Calculator_Lv

import java.lang.Exception

//레벨1,2
fun main() {
    //더하기
    val addCalc = Calculator(AddOperation())
    println("10 더하기 20 결과는 : ${addCalc.operate(10,20)} 입니다.")
    //빼기
    val subCalc = Calculator(SubstractOperation())
    println("10 빼기 20 결과는 : ${subCalc.operate(10,20)} 입니다.")
    //곱하기
    val mulCalc = Calculator(MultiplyOperation())
    println("10 곱하기 20 결과는 : ${mulCalc.operate(10,20)} 입니다.")
    //나누기
    val divCalc = Calculator(DivideOperation())
    println("30 나누기 20 결과는 : ${divCalc.operate(30,20)} 입니다.")

}