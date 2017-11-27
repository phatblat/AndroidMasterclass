package at.phatbl.mydemofragment

import android.accounts.AuthenticatorDescription

/**
 * Created by ben on 11/27/17.
 */
data class Menu(
        val name: String, val description: String
) {
    companion object {
        val menus: Array<Menu> = arrayOf(
                Menu("Breakfast", "2 Whole eggs\nBread\nCoffee"),
                Menu("Lunch", "3 Whole eggs\nBroccoli"),
                Menu("Dinner", "Brown rice\nPotato\nBroccoli")
        )
    }
}
