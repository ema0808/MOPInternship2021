package com.internship.moployality.data.api

import com.internship.moployality.data.model.User
import io.reactivex.Single

interface ApiService {

  fun getUsers(): Single<List<User>>

}