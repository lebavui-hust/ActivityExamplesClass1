package vn.edu.hust.activityexamples

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        try {
            val param1 = intent.getStringExtra("param1")?.toDouble()
            val param2 = intent.getStringExtra("param2")?.toDouble()
            val result = param1!! + param2!!

            val textView = findViewById<TextView>(R.id.textView)
            textView.text = "Param1 = $param1\nParam2 = $param2\nResult = $result"

            intent.putExtra("result", result)
            setResult(Activity.RESULT_OK, intent)
        } catch (ex: Exception) {
            setResult(Activity.RESULT_CANCELED)
        }

    }
}