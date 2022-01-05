package com.nepplus.librarypractice_20220105

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgProfilePhoto.setOnClickListener {

//              사진 크게 보기 화면으로 진입. (Intent - 추가 액티비티 필요)

            val myIntent = Intent(this, ViewPhotoActivity::class.java)
            startActivity(myIntent)

        }

//      Glide 이용 => 웹의 이미지를 -> imREcent에 반영하기
        Glide.with(this).load("https://d3n24gmmpz5ort.cloudfront.net/2021/02/1edea7cf8a24b3a46558fccd4cc61ea4/%EC%8D%B8%EB%84%A4%EC%9D%BC.jpg").into(imgRecent)

    }
}