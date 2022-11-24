package com.example.personal_computer

import android.graphics.drawable.Drawable
import android.os.Parcelable
import android.widget.ImageView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel1 : ViewModel() {
        val name : MutableLiveData<String> by lazy {
            MutableLiveData<String>()
        }
        val cena: MutableLiveData<String> by lazy {
            MutableLiveData<String>()
        }
        val Spec: MutableLiveData<String> by lazy {
            MutableLiveData<String>()
        }
        val img: MutableLiveData<Int> by lazy {
            MutableLiveData<Int>()
        }
}