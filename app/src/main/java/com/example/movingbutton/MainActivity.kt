package com.example.movingbutton

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var moveDown:Boolean=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstbtn.setOnClickListener {
            if (moveDown) {
                moveDownButton()
            }
            else{
                moveUpButton()
            }
        }

    }
    private fun moveUpButton(){
        ObjectAnimator.ofFloat(linear1,"translationY",-150f).apply {
            text.visibility=View.VISIBLE
            duration=200
            start()
        }
        ObjectAnimator.ofFloat(linear2,"translationY",-300f).apply {
            text2.visibility=View.VISIBLE
            duration=200
            start()
        }
        moveDown=true

    }
    private fun moveDownButton(){
        ObjectAnimator.ofFloat(linear1,"translationY",0f).apply {
            text.visibility=View.INVISIBLE
            duration=200
            start()
        }
        ObjectAnimator.ofFloat(linear2,"translationY",0f).apply {
            text2.visibility=View.INVISIBLE
            duration=200
            start()
        }
        moveDown=false
    }
}