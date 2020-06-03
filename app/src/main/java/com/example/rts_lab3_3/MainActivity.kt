package com.example.rts_lab3_3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onCalculateClick(view: View) {
        val coefs = listOf(a1.text.toString().toInt(),
            a2.text.toString().toInt(),
            a3.text.toString().toInt(),
            a4.text.toString().toInt())
        val answer = answerField.text.toString().toInt()
        val (answers, duration, mutatenum) = solve(coefs, answer)
        val toast = Toast.makeText(
            applicationContext,
            getString(R.string.solvingTime, duration.first, duration.second, mutatenum),
            Toast.LENGTH_SHORT)
        toast.show()

        x1.setText(answers[0].toString())
        x2.setText(answers[1].toString())
        x3.setText(answers[2].toString())
        x4.setText(answers[3].toString())
    }
}


