package com.example.lv2_calculator


    class Solution {
        fun solution(num1: Int, num2: Int): Int {
            var answer: Int = 0
            if (0 < num1 && num1 <= 100) {
                if (0 < num2 && num2 <= 100) {
                    answer = num1 / num2
                }
            }
            return answer
        }
    }
