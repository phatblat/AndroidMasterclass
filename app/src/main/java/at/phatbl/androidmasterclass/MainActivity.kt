package at.phatbl.androidmasterclass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

/**
 * Main activity.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked(view: View) {
        val textView = findViewById<TextView>(R.id.message)
        textView.text = "Button clicked"
    }
}
