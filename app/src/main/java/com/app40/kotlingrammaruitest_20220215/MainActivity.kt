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
          else if(inputId !="admin") {
              Toast.makeText(this, "아이디가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
          }

          else {
//              로그인에 실패했고 아이디는 맞게 넣었다면 => 비번만 틀렸다고 간주하자
              Toast.makeText(this, "비밀번호가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
          }


      }
            

    }
}