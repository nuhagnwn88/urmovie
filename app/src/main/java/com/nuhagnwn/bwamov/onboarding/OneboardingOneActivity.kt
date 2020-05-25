package com.nuhagnwn.bwamov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nuhagnwn.bwamov.R
import com.nuhagnwn.bwamov.sign.signin.SignInActivity
import com.nuhagnwn.bwamov.utils.Preferences
import kotlinx.android.synthetic.main.activity_oneboarding_one.*

class OneboardingOneActivity : AppCompatActivity() {

    lateinit var preferences: Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oneboarding_one)

        preferences = Preferences(this)

        if (preferences.getValues("onboarding").equals("1")) {
            finishAffinity()

            val intent = Intent(this@OneboardingOneActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }

        btn_home.setOnClickListener {
            val intent = Intent(this@OneboardingOneActivity,
                OneboardingTwoActivity::class.java)
            startActivity(intent)
        }

        btn_daftar.setOnClickListener {
            finishAffinity()

            val intent = Intent(this@OneboardingOneActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
