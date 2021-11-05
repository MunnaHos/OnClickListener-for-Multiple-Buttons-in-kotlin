package com.example.multiple_button_click

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() ,View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var one= findViewById<Button>(R.id.btn_one)
        var two= findViewById<Button>(R.id.btn_two)
        var three= findViewById<Button>(R.id.btn_three)
        var four = findViewById<Button>(R.id.btn_four)

        one.setOnClickListener(this)
        two.setOnClickListener(this)
        three.setOnClickListener(this)  // "this" is MainActivity
        four.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_one -> {
                Toast.makeText(this,"Btn One is Click",Toast.LENGTH_SHORT).show()
            }
            R.id.btn_two ->{
                Toast.makeText(this,"Btn Two is Click",Toast.LENGTH_SHORT).show()
            }
            R.id.btn_three -> {
                Toast.makeText(this,"Btn Three is Click",Toast.LENGTH_SHORT).show()
            }
            R.id.btn_four -> {
                var txt =findViewById<TextView>(R.id.txt_view)
                txt.setText("Hi Faysal").toString()    // I have just set "Hi Faysal" text

            }
        }





    }
}