package com.example.mod5navigationinterne

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(val mail : String, val password : String) : Parcelable
