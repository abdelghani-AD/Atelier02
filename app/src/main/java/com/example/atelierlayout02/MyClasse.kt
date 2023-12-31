package com.example.atelierlayout02

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.Button

@SuppressLint("AppCompatCustomView")
class MyClasse : Button{
    constructor(context: Context?,attrs:AttributeSet?):super(context,attrs)
    constructor(context: Context?,attrs: AttributeSet?,defStyleAttr:Int):super(context,attrs,defStyleAttr)
    constructor(context: Context?,attrs: AttributeSet?,defStyleAttr:Int,defStyleRes:Int):super(context, attrs, defStyleAttr, defStyleRes)

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        Log.i("MyClasse","Layout terminé")
    }
}