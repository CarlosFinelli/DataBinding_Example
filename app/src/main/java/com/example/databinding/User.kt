package com.example.databinding

import android.content.ContentValues.TAG
import android.util.Log

class User {
    private final var TAG = "User"
    lateinit var name: String
    var age = 0
    var active: Boolean = false
    lateinit var imageUrl: String

    constructor(name: String, age: Int, active: Boolean, imageUrl: String) {
        this.age = age
        this.name = name
        this.active = active
        this.imageUrl = imageUrl
    }

    override fun toString(): String {
        return "User{name = '${this.name}', age = '${this.age}', active = '${this.active}', imageUrl = '${this.imageUrl}'}"
    }

    fun handleClick() {
        Log.d(this.TAG, "handleClick: ${this.name}")
    }
}