package com.nuhagnwn.bwamov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.nuhagnwn.bwamov.onboarding.OneboardingOneActivity

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@SplashScreenActivity,
                OneboardingOneActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}
