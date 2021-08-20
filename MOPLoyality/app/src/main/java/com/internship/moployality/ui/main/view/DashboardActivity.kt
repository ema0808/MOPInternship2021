package com.internship.moployality.ui.main.view

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.internship.moployality.R
import com.google.android.gms.auth.api.signin.GoogleSignIn

import com.google.android.gms.auth.api.signin.GoogleSignInAccount




class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        val acct = GoogleSignIn.getLastSignedInAccount(this)
        if (acct != null) {
            val personName = acct.displayName

            val personEmail = acct.email
            val personId = acct.id
            val personPhoto: Uri? = acct.photoUrl

//            name.setText(personName)
//            email.setText(personEmail)
//            id.setText(personId)
        }
    }
}