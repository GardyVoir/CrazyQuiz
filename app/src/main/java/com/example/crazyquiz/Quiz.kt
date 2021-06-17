package com.example.crazyquiz

data class Quiz ( var question: String, var answer1: String, var answer2: String, var correctAnswerNumber: Int){
    fun isCorrect(answerNumber: Int) : Boolean {
        if((answerNumber) == correctAnswerNumber)
            return true
        return false
    }
}