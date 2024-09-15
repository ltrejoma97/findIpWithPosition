package org.ltrejoma.findippositionwithip

import android.app.Application
import org.koin.core.context.startKoin
import org.ltrejoma.findippositionwithip.di.appModule

class FindPositionWithIpApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{

            modules(*appModule().toTypedArray())
        }
    }
}