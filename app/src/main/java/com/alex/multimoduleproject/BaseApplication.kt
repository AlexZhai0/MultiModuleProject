package com.alex.multimoduleproject

import android.app.Application
import com.alex.multimoduleproject.BuildConfig.*
import com.alibaba.android.arouter.launcher.ARouter

class BaseApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        if (DEBUG) {
            ARouter.openLog();//开启日志
            ARouter.openDebug();//开启debug模式
        }
        ARouter.init(this)
    }
}