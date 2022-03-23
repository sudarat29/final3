package com.example.final3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        button2 .setOnClickListener {
            val intent = Intent(this,MainActivity6::class.java)
            intent.putExtra(result,"ถูกแล้วจ้าา")
            startActivity(intent)
        }

        button3 .setOnClickListener {
            val intent = Intent(this,MainActivity6::class.java)
            intent.putExtra(result,"ว้ายผิดนะจ้ะ")
            startActivity(intent)
        }
        button4 .setOnClickListener {
            val intent = Intent(this,MainActivity6::class.java)
            intent.putExtra(result,"ถูกแล้วจ้าา")
            startActivity(intent)
        }
        button5 .setOnClickListener {
            val intent = Intent(this,MainActivity6::class.java)
            intent.putExtra(result,"ว้ายผิดนะจ้ะ")
            startActivity(intent)
        }
    }
}