package com.example.myapplication_34

import android.content.Context

class MyPref(context: Context) {
    //constant variables
    var PREF_NAME = " Mypref"
    val SCORE =" Myscore"
    var pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)    //create a temporary storage

    fun getScore():Int{    //called for the current score
        return pref.getInt(SCORE, 0)
    }

    fun setScore(updatedScore: Int){
        var editor = pref.edit()
        editor.putInt(SCORE,updatedScore)
        editor.apply()
    }
}