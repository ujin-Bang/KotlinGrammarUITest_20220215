package com.app40.kotlingrammaruitest_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
      btnLogin.setOnClickListener {

          val inputId = edtId.text.toString()
          val inputPw = edtPw.text.toString()
          
          if(inputId == "admin" && inputPw =="asdf"){
              Toast.makeText(this, "관리자님 환영합니다", Toast.LENGTH_SHORT).show()
          }


      }
            

    }
}