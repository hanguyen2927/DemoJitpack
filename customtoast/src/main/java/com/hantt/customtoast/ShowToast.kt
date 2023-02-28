package com.hantt.customtoast

import android.content.Context
import android.widget.Toast

object ShowToast {
    fun toastMessage(context: Context, message: HelloToast) {
        Toast.makeText(context, message.message, Toast.LENGTH_SHORT).show()
    }
}
