package com.mlsdev.androidanimations

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.AnimationUtils
import com.mlsdev.androidanimations.library.BaseViewAnimator

class MainActivity : AppCompatActivity() {
    private lateinit var animationView: View
    private var animation: BaseViewAnimator? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        animationView = findViewById(R.id.hello_world)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = RecyclerViewAdapter(::onItemClick)
        with(recyclerView){
            this.adapter = adapter
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
        }
    }

    private fun onItemClick(item: String){
        val animationParams = AnimationParams(
            repeatTimes = 0,
            duration = 1000L
        )

        animation?.cancel()
        animation = AnimationUtils.getAnimation(item, animationView, animationParams)
        animation?.start()
    }
}
