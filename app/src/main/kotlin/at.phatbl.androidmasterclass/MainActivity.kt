package at.phatbl.androidmasterclass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

/**
 * Main activity.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked() {
        val editTextWeight = findViewById<EditText>(R.id.userWeight)
        val editTextHeight = findViewById<EditText>(R.id.userHeight)

        val weight = editTextWeight.text.toString().toDouble()
        val height = editTextHeight.text.toString().toDouble()
        val bmi = calculateBMI(weight = weight, height = height)

        val textViewResult = findViewById<TextView>(R.id.userBMI)
        textViewResult.text = bmi.toString()
    }

    /**
     * w/h^2
     * @param weight Weight of the user, in kilograms.
     * @param height Height of the user, in centimeters.
     * @return BMI of the user.
     */
    fun calculateBMI(weight: Double, height: Double): Double {
        return weight / (height * height)
    }
}
