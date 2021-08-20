package com.internship.moployality.ui.main.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.internship.moployality.R


class SplashActivity : AppCompatActivity() {



  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setupUI()
    supportActionBar?.hide()

     // binding= ActivityMainBinding.inflate(layoutInflater)
      //val view: View = binding!!.root
      setContentView(R.layout.activity_splash)

      //binding.

    Handler(Looper.getMainLooper()).postDelayed({
//      val intent= Intent(this@MainActivity,HomeActivity::class.java)
//      startActivity(intent)
      Navigation.findNavController(this, R.id.my_nav).navigate(R.id.homeActivity)
      finish()
    },3000)
  }

  private fun setupUI() {

  }

}