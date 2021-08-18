package com.internship.moployality.ui.main.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.internship.moployality.R

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    setupUI()
    supportActionBar?.hide()

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