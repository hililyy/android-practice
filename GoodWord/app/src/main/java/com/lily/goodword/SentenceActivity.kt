package com.lily.goodword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

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

        val sentenceAdapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceAdapter
    }
}