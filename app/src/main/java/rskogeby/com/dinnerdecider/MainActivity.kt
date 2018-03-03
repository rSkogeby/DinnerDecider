package rskogeby.com.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.main_activity.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese","Hamburger","Pizza","McDonalds","Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        decideBtn.setOnClickListener {
            var random = Random()
            val randomFood = random.nextInt(foodList.count())
            println(foodList[randomFood])
        }


    }
}
