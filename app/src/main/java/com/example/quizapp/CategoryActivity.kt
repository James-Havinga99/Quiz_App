package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_category.*

class CategoryActivity : AppCompatActivity() {

    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        //Hide status bar on top of phone
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        tv_flags.setOnClickListener{
            val intent = Intent(this, FlagQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            startActivity(intent)
            finish()
        }

        tv_logos.setOnClickListener{
            val intent = Intent(this, LogoQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            startActivity(intent)
            finish()
        }

        tv_animals.setOnClickListener{
            val intent = Intent(this, AnimalQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            startActivity(intent)
            finish()
        }

        tv_plants.setOnClickListener{
            val intent = Intent(this, PlantQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            startActivity(intent)
            finish()
        }
    }
}