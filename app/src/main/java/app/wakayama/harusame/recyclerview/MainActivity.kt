package app.wakayama.harusame.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val listData: List<listData> = listOf(
        listData(R.drawable.aed,"aed","aedのアイコン"),
        listData(R.drawable.batt,"batt","battのアイコン"),
        listData(R.drawable.book,"book","bookのアイコン"),
        listData(R.drawable.man,"man","manのアイコン"),
        listData(R.drawable.med,"med","medのアイコン"),
        listData(R.drawable.onsen,"onsen","onsenのアイコン"),
        listData(R.drawable.rain,"rain","rainのアイコン"),
        listData(R.drawable.spoon,"spoon","spoonのアイコン"),
        listData(R.drawable.woman,"woman","womanのアイコン")
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = recyclerViewAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        adapter.addAll(listData)
    }
}