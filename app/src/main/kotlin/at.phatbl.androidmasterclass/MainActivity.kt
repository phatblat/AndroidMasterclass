package at.phatbl.androidmasterclass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

/**
 * Main activity.
 */
class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "Message"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG, "onRestoreInstanceState")
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.i(TAG, "onSaveInstanceState")
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
