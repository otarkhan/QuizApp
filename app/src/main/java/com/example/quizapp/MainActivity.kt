package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun eval(){
        var perc = 0;


        if (g1.checkedRadioButtonId == yes1.id)
            perc += 50
        if (g2.checkedRadioButtonId == no2.id)
            perc += 50
;
        Toast.makeText(this, "Your score is: "+perc+"%",Toast.LENGTH_LONG).show()
    }

    fun res(){
        g1.clearCheck()
        g2.clearCheck()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit.setOnClickListener { eval() }
        reset.setOnClickListener { res() }
    }
}
