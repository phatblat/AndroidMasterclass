package at.phatbl.mydemofragment

import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
 class MenuDetailFragment: Fragment() {
    var menuID: Int = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
//        menuID = savedInstanceState.getLong("menuID")

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_detail, container, false)
    }

    override fun onStart() {
        super.onStart()

        if (view != null) {
            val title = view.findViewById<TextView>(R.id.name)
            val description = view.findViewById<TextView>(R.id.description)
            val menu = Menu.menus[menuID]
            title.text = menu.name
            description.text = menu.description
        }
    }
}
