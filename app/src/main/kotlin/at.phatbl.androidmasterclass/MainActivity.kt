package at.phatbl.androidmasterclass

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
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

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener { v: View ->
            val textView = findViewById<TextView>(R.id.textView)
            textView.text = "Button Clicked"
        }
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

    @Suppress("UNUSED_PARAMETER")
    fun buttonClicked(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}
