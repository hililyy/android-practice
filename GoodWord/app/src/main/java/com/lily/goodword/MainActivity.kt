package com.lily.goodword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.lily.goodword.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("명언 1")
        sentenceList.add("명언 2")
        sentenceList.add("명언 3")
        sentenceList.add("명언 4")
        sentenceList.add("명언 5")
        sentenceList.add("명언 6")
        sentenceList.add("명언 7")
        sentenceList.add("명언 8")
        sentenceList.add("명언 9")
        sentenceList.add("명언 10")



        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener {

            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }

        binding.goodWordTextArea.setText(sentenceList.random())
    }
}