package com.example.artkenneth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.artkenneth.R

class MainActivity : AppCompatActivity() {

    private val artImages = arrayOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
    )

    private val artDescriptions = arrayOf(
        "QT Case ni Ivy - KamenKenba (2024)",
        "You Got a Friend in Me - KamenKenba (2024)",
        "Spirit Blossom Syndra - League of Legends (2024)",
        "Beneath the Mask of Light - Cluelias (2024)",
        "Family's Love - KamenKenba (2024)",
    )

    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val artImageView: ImageView = findViewById(R.id.artImageView)
        val descriptionTextView: TextView = findViewById(R.id.descriptionTextView)
        val prevButton: Button = findViewById(R.id.prevButton)
        val nextButton: Button = findViewById(R.id.nextButton)

        updateContent(artImageView, descriptionTextView)

        nextButton.setOnClickListener {
            if (currentIndex < artImages.size - 1) {
                currentIndex++
                updateContent(artImageView, descriptionTextView)
            }
        }

        prevButton.setOnClickListener {
            if (currentIndex > 0) {
                currentIndex--
                updateContent(artImageView, descriptionTextView)
            }
        }
    }

    private fun updateContent(imageView: ImageView, descriptionView: TextView) {
        imageView.setImageResource(artImages[currentIndex])
        descriptionView.text = artDescriptions[currentIndex]
    }
}
