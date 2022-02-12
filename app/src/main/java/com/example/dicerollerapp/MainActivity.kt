package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbtn:Button=findViewById(R.id.button)
        rollbtn.setOnClickListener {
            val toast=Toast.makeText(this,"Dice Rolled",Toast.LENGTH_SHORT)
            toast.show()
            rollDice()



        }
    }

    private fun rollDice() {
        val dice=Dice(6)
        val diceRoll=dice.roll()
        val image:ImageView=findViewById(R.id.imageView)

        if(diceRoll==1){image.setImageResource(R.drawable.dice_1)}
        else if(diceRoll==2){image.setImageResource(R.drawable.dice_2)}
        else if(diceRoll==3){image.setImageResource(R.drawable.dice_3)}
        else if(diceRoll==4){image.setImageResource(R.drawable.dice_4)}
        else if(diceRoll==5){image.setImageResource(R.drawable.dice_5)}
        else if(diceRoll==6){image.setImageResource(R.drawable.dice_6)}

    }
}

class Dice(val numSides:Int){
    fun roll():Int{
        return (1..numSides).random()
    }
}