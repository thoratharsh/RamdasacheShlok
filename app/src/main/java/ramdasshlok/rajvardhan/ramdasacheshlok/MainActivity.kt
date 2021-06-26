package ramdasshlok.rajvardhan.ramdasacheshlok

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var selectedIndex = 0

        val allShlokas = resources.getStringArray(R.array.shlokas)
        todaysShlokDetails.text = allShlokas[0]
        val allShlokasTrans = resources.getStringArray(R.array.shlokasTransalation)
        todaysShlokTranslationDetails.text = allShlokasTrans[0]
        nextShlokButton.setOnClickListener {view ->
            if (selectedIndex == allShlokas.size-1){
                selectedIndex = 0
            } else
                selectedIndex++
            todaysShlokDetails.text = allShlokas[selectedIndex]
            todaysShlokTranslationDetails.text = allShlokasTrans[selectedIndex]
        }
        prevShlokButton.setOnClickListener { view ->
            if (selectedIndex == 0){
                selectedIndex = allShlokas.size -1
            } else
                selectedIndex--
            todaysShlokDetails.text = allShlokas[selectedIndex]
            todaysShlokTranslationDetails.text = allShlokasTrans[selectedIndex]
        }
    }
}
