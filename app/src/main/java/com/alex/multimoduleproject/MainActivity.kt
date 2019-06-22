package com.alex.multimoduleproject

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        ARouter.init(application)
        findViewById<TextView>(R.id.textView)
        textView.setOnClickListener {
            Toast.makeText(this, "222", Toast.LENGTH_SHORT).show()
            ARouter.getInstance()
//                .build("/app/activity/Main2Activity")
                .build("/module2/activity/Module2Activity")
                .navigation()

//            startActivity(Intent(this, Module2Activity::class.java))
        }
    }
}
