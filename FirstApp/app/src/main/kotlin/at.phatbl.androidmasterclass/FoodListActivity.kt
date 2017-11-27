package at.phatbl.androidmasterclass

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView

class FoodListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_list)

        val itemClickListener = AdapterView.OnItemClickListener { listView, view, position, id ->
            if (position == 0) {
                val intent = Intent(this@FoodListActivity, FoodCategoryActivity::class.java)
                startActivity(intent)
            }
        }

        val listView = findViewById<ListView>(R.id.list_options)
        listView.onItemClickListener = itemClickListener
    }
}
