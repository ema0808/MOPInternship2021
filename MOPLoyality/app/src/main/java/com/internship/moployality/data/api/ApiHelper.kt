package com.internship.moployality.data.api

class ApiHelper(private val apiService: ApiService) {

  fun getUsers() = apiService.getUsers()

}