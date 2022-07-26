package com.arhsxro.registrationformapp

import java.io.Serializable

data class User(

    val title:String,
    val firstname:String,
    val lastname:String,
    val email:String,
    val phone:String,
    val password:String
): Serializable {

    fun getFullName() = "$title $firstname $lastname"

}
