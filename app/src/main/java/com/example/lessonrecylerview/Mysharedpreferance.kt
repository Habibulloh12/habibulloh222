package com.example.lessonrecylerview

import android.content.Context
import android.content.SharedPreferences

object Mysharedpreferance {
    private const val NAME = "registration"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var sharedPreferences: SharedPreferences
    fun Init(context: Context) {
        sharedPreferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    var text: String?
        get() = sharedPreferences.getString("key1", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("key1", value)
            }
        }
    var user: String?
        get() = sharedPreferences.getString("user", "")
        set(value) = sharedPreferences.edit()
        {
            if (value != null) {
                it.putString("user", value)
            }
        }
}
