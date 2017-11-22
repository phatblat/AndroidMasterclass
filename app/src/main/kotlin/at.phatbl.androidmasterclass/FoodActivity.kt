package at.phatbl.androidmasterclass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class FoodActivity : AppCompatActivity() {
    companion object {
        val EXTRA_FOOD_NUMBER = "food_number"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        Log.i("Message", "foodNumber: ${intent.extras[EXTRA_FOOD_NUMBER]}")
        val foodNumber = intent.extras[EXTRA_FOOD_NUMBER] as Int
        val food = Food.foods[foodNumber]

        val name = findViewById<TextView>(R.id.name)
        val description = findViewById<TextView>(R.id.description)
        val foodImage = findViewById<ImageView>(R.id.foodImage)

        name.text = food.name
        description.text = food.description
        foodImage.setImageResource(food.imageID)
    }
}
