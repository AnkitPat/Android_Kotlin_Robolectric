package roomdb.com.roboelectricdemo

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_simple.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                startActivity(Intent(this@MainActivity, HomeActivity::class.java))
            }
        })
    }
}
