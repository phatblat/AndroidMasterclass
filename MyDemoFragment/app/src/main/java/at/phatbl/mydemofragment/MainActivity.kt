package at.phatbl.mydemofragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/**
 * Simple activity containing a fragment.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frag = fragmentManager.findFragmentById(R.id.detail_frag) as MenuDetailFragment
        frag.menuID = 1
    }
}
