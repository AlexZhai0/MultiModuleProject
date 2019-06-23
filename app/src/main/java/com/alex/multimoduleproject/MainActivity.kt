package com.alex.multimoduleproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonThisProject.setOnClickListener {
            ARouter.getInstance()
                .build("/app/SecondActivity")
                .navigation()
        }

        buttonModule1Project.setOnClickListener {
            ARouter.getInstance()
                .build("/module1/Module1Activity")
                .navigation()
        }

        buttonModule2Project.setOnClickListener {
            ARouter.getInstance()
                .build("/module2/Module2Activity")
                .navigation()
        }
    }
}
