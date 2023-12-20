package com.lily.mango_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
            ContentsModel(
                "https://e.kakao.com/t/cute-animal-puns",
                "https://item.kakaocdn.net/do/9c5d673c91e8f1080c2602931c81f178f43ad912ad8dd55b04db6a64cddaf76d",
                "이무 이미지"
            )
        )
        items.add(
            ContentsModel(
                "https://e.kakao.com/t/cute-animal-puns",
                "https://item.kakaocdn.net/do/9c5d673c91e8f1080c2602931c81f178f43ad912ad8dd55b04db6a64cddaf76d",
                "이무 이미지"
            )
        )
        items.add(
            ContentsModel(
                "https://e.kakao.com/t/cute-animal-puns",
                "https://item.kakaocdn.net/do/9c5d673c91e8f1080c2602931c81f178f43ad912ad8dd55b04db6a64cddaf76d",
                "이무 이미지"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerView.adapter = rvAdapter

        rvAdapter.itemClick = object: RVAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {
                val intent = Intent(baseContext, ViewActivity:: class.java)
                intent.putExtra("url", items[position].url)
                startActivity(intent)
            }
        }

        recyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}