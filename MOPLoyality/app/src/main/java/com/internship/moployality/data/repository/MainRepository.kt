package com.internship.moployality.data.repository

import com.internship.moployality.data.api.ApiHelper
import com.internship.moployality.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

  fun getUsers(): Single<List<User>> {
    return apiHelper.getUsers()
  }

}