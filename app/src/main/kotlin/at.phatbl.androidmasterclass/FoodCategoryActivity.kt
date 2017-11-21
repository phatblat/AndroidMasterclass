package at.phatbl.androidmasterclass

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class FoodCategoryActivity : ListActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listFoods = listView
        val listAdapter = ArrayAdapter<Food>(this, android.R.layout.simple_list_item_1, Food.foods)
        listFoods.adapter = listAdapter
    }

    override fun onListItemClick(l: ListView?, v: View?, position: Int, id: Long) {
        super.onListItemClick(l, v, position, id)

        val intent = Intent(this@FoodCategoryActivity, FoodActivity::class.java)
        intent.putExtra(FoodActivity.EXTRA_FOOD_NUMBER, id.toInt())
        startActivity(intent)
    }
}
