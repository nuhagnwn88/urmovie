package com.nuhagnwn.bwamov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nuhagnwn.bwamov.R
import kotlinx.android.synthetic.main.activity_oneboarding_one.*

class OneboardingTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oneboarding_two)

        btn_home.setOnClickListener {
            val intent = Intent(this@OneboardingTwoActivity,
                OneboardingThreeActivity::class.java)
            startActivity(intent)
        }
    }
}
