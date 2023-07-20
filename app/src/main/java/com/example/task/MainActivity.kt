package com.example.task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val clk_button: Button = findViewById(R.id.clk_rotate_button)



        val image: ImageView = findViewById(R.id.imageView)


        clk_button.setOnClickListener()
        {

            val clk_rotate = AnimationUtils.loadAnimation(
                this,
                R.anim.rotate_clockwise
            )


            image.startAnimation(clk_rotate)
        }

        val anticlk_button: Button = findViewById(R.id.anticlockwise_rotate_button)

        anticlk_button.setOnClickListener()
        {

            // loading the animation of
            // rotate_anticlockwise.xml file into a variable
            val anticlk_rotate = AnimationUtils.loadAnimation(
                this,
                R.anim.anticlockwise_rotation
            )

            // assigning that animation to
            // the image and start animation
            image.startAnimation(anticlk_rotate)
        }

    }
}