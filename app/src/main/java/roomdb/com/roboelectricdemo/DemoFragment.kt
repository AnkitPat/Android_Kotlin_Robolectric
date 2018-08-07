package roomdb.com.roboelectricdemo

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class DemoFragment: Fragment() {

    companion object {
        const val TAG = "demo_fragment"
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val mLayout = inflater!!.inflate(R.layout.fragment_demo,container,false)

        return mLayout
    }
}