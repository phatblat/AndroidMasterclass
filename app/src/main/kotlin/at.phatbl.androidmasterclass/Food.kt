package at.phatbl.androidmasterclass

/**
 * Created by ben on 11/21/17.
 */
data class Food(
        val name: String,
        val description: String,
        val imageID: Int
) {
    companion object {
        val foods = arrayOf(
                Food("Pizza", "Thin crust pizza with extra cheese", R.drawable.pizza),
                Food("Burger", "Veg burger with healthy stuff", R.drawable.burger),
                Food("Sandwich", "Whole wheat sandwich", R.drawable.sandwich)
        )
    }
}
