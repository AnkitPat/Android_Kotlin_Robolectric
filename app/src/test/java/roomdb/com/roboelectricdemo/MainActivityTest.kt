package roomdb.com.roboelectricdemo

import android.os.Build
import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import android.widget.TextView
import org.junit.Test
import org.robolectric.shadows.ShadowIntent
import android.content.Intent
import android.widget.Button
import org.hamcrest.CoreMatchers.equalTo
import org.robolectric.Shadows.shadowOf
import org.robolectric.shadows.ShadowActivity




@Config(application = MyApplication::class,constants = BuildConfig::class, sdk = intArrayOf(Build.VERSION_CODES.LOLLIPOP_MR1))
@RunWith(RobolectricTestRunner::class)
class MainActivityTest {

    var activity: MainActivity? = null

    @Before
    fun setup() {
        activity = Robolectric.buildActivity(MainActivity::class.java)
                .create()
                .resume()
                .get()
    }

    @Test
    fun validateTextViewContent() {
        val textView = activity!!.findViewById(R.id.text_view_main) as TextView

        assertNotNull("Text is null", textView)
        assertTrue("Text not match", "Main Activity" == textView.text.toString())
    }

    @Test
    fun validateButtonClick() {
        val button: Button = activity!!.findViewById(R.id.button_simple)

        button.performClick()
        val shadowActivity = shadowOf(activity)
        val startedIntent = shadowActivity.getNextStartedActivity()
        val shadowIntent = shadowOf(startedIntent)
        assertThat(shadowIntent.getIntentClass().getName(), equalTo(HomeActivity::class.java.name))
    }
}