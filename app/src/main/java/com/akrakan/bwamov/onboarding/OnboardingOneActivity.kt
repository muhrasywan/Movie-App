package com.akrakan.bwamov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akrakan.bwamov.R
import com.akrakan.bwamov.sign.SignInActivity

class OnboardingOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_one)

//        btn_home.setOnClickListener{
//            var intent = Intent(this@OnboardingOneActivity, OnboardingTwoActivity::class.java)
//            startActivity(intent)
//        }
//        btn_daftar.setOnClickListener{
//            var intent = Intent(this@OnboardingOneActivity, SignInActivity::class.java)
//            startActivity(intent)
//        }
    }
}