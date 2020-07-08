package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random as RandomRandom

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's roll"
        rollButton.setOnClickListener{
//            Toast.makeText(this, "button clicked", Toast.LENGTH_LONG ).show()
            rollDice()
        }

        diceImage = findViewById(R.id.dice_image)

    }

    private fun rollDice() {
//        val resultText: TextView = findViewById(R.id.result_text)

        val drawableResource = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

//        resultText.text = randomInt.toString()

        diceImage.setImageResource(drawableResource)
    }
}