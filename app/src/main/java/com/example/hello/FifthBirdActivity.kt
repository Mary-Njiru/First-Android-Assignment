package com.example.hello

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFifthBirdBinding
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.squareup.picasso.Picasso
import java.nio.channels.Pipe

class FifthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFifthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn8Next.setOnClickListener {
            finish()
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1613891188927-14c2774fb8d7?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzF8fGJpcmR8ZW58MHx8MHx8fDA%3D")
            .fit()
            .into(binding.imageView11)
    }
}