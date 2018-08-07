package roomdb.com.roboelectricdemo

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        text_view.setOnClickListener {
            fragmentManager.beginTransaction().replace(android.R.id.content,DemoFragment(),DemoFragment.TAG).commit()
        }
    }
}