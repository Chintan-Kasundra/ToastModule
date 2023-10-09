package com.example.toastlibrary

import android.content.Context
import android.widget.Toast

fun Context.showToast(text: String, time: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}