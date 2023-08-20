package com.lily.animal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.animalImage1)
        image1.setOnClickListener {

            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Animal1Activity::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.animalImage2)
        val image3 = findViewById<ImageView>(R.id.animalImage3)
        val image4 = findViewById<ImageView>(R.id.animalImage4)

        image2.setOnClickListener {
            val intent = Intent(this, Animal2Activity::class.java)
            startActivity(intent)
        }

        image3.setOnClickListener {
            val intent = Intent(this, Animal3Activity::class.java)
            startActivity(intent)
        }

        image4.setOnClickListener {
            val intent = Intent(this, Animal4Activity::class.java)
            startActivity(intent)
        }
    }
}