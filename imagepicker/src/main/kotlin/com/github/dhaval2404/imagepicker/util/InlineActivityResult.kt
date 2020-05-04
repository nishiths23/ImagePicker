package com.github.dhaval2404.imagepicker.util

import android.content.Intent
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

/**
 * Inline Activity Result
 *
 * @author Dhaval Patel
 * @version 2.0
 * @since 29 April 2020
 */
fun AppCompatActivity.startActivityForResult(
    intent: Intent,
    listener: (Int, Intent?) -> Unit?
) {
    registerForActivityResult(StartActivityForResult()) { result: ActivityResult ->
        listener.invoke(result.resultCode, result.data)
    }.launch(intent)
}

fun Fragment.startActivityForResult(intent: Intent, listener: (Int, Intent?) -> Unit?) {
    registerForActivityResult(StartActivityForResult()) { result: ActivityResult ->
        listener.invoke(result.resultCode, result.data)
    }.launch(intent)
}