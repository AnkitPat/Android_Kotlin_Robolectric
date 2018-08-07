package roomdb.com.roboelectricdemo

import android.os.Build
import android.widget.Button
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.Shadows
import org.robolectric.annotation.Config


@Config(application = MyApplication::class,constants = BuildConfig::class, sdk = intArrayOf(Build.VERSION_CODES.LOLLIPOP_MR1))
@RunWith(RobolectricTestRunner::class)
class HomeActivityTest {

    var activity: HomeActivity? = null

    @Before
    fun setup() {
        activity = Robolectric.buildActivity(HomeActivity::class.java)
                .create()
                .resume()
                .get()
    }

    @Test
    fun checkFragmentLauch() {
        val button: Button = activity!!.findViewById(R.id.text_view)

        button.performClick()
        val dialog = activity!!
                .getFragmentManager().findFragmentByTag(DemoFragment.TAG) as DemoFragment

        Assert.assertNotNull(dialog)
    }
}