package at.phatbl.androidmasterclass

/**
 * Created by ben on 11/21/17.
 */
data class Food(
        val name: String,
        val description: String
) {
    companion object {
        val foods = arrayOf(
                Food("Pizza", "Thin crust pizza with extra cheese"),
                Food("Burger", "Veg burger with healthy stuff"),
                Food("Sandwich", "Whole wheat sandwich")
        )
    }
}
