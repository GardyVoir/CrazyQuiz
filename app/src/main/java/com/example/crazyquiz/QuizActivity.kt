package com.example.crazyquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class QuizActivity : AppCompatActivity() {
    var quizs = ArrayList<Quiz>()
    var numberOfGoodAnswers: Int = 0
    var currentQuizIndex: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        quizs.add(Quiz( question: "Selon la légende, comment le pape Adrien IV est-t-il mort en 1159 ?",
                            answer1: "En avalant une mouche",
                            answer2: "En chutant de cheval" ,
                            answer3: "En tombant d'un balcon" ,
                            answer4: "En se cognant contre une porte"
                            correctAnswerNumber: 1))
    }

    fun showQuestion(quiz: Quiz) {
        txtQuestion.setText(quiz.question)
    }
}