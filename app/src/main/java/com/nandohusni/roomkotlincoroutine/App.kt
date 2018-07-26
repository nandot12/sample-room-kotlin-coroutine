package com.nandohusni.roomkotlincoroutine

import android.app.Application
import android.arch.persistence.room.Room



/**
 * Created by nandoseptianhusni on 26/07/18.
 */
//TODO 1 configurasi room di app
class App : Application() {


    companion object {
        lateinit var database: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this, AppDatabase::class.java!!, "product-db").build()
    }
}