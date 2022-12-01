package com.example.databinding

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.ViewModel
import com.bumptech.glide.Glide

class MainActivityViewModel : ViewModel() {
    private val TAG = "User"
    lateinit var name: String
    var age = 0
    var active: Boolean = false
    lateinit var imageUrl: String

    fun setData(name: String, age: Int, active: Boolean, imageUrl: String) {
        this.age = age
        this.name = name
        this.active = active
        this.imageUrl = imageUrl
    }

    fun handleClick() {
        Log.d(this.TAG, "handleClick: ${this.name}")
    }

    companion object {
        @JvmStatic
        @BindingAdapter("android:whatever")
        fun loadImage(imageView: ImageView, imageUrl: String) {
            Glide.with(imageView).load(imageUrl).into(imageView)
        }
    }

    fun setText() : String {
        return "Teste de uso da função "
    }
}