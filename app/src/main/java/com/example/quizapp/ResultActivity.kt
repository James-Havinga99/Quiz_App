package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        // Remove status bar on top of phone
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        // Receiving data from quiz
        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = username
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        tv_score.text = "Your score is $correctAnswers out of $totalQuestions"
        // Finish button to go back to name page
        btn_finish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}