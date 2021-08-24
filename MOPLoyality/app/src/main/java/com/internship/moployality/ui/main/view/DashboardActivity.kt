package com.internship.moployality.ui.main.view

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.internship.moployality.R
import com.google.android.gms.auth.api.signin.GoogleSignIn

import com.google.android.gms.auth.api.signin.GoogleSignInAccount




class DashboardActivity : AppCompatActivity() {

    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        imageVIew= findViewById<>(R.id.imageView2)
        name= findViewById<>(R.id.textName)
        email= findViewById<>(R.id.textEmail)
        id= findViewById<>(R.id.textID)
        signOut=findViewById<>(new View.onClickListener)



        val acct = GoogleSignIn.getLastSignedInAccount(this)
        if (acct != null) {
            val personName = acct.displayName

            val personEmail = acct.email
            val personId = acct.id
            val personPhoto: Uri? = acct.photoUrl

            name.setText(personName)
            email.setText(personEmail)
            id.setText(personId)
            Glide.with(this).load(String.valueOf(personPhoto)).into(imageView);
        }
    }
}