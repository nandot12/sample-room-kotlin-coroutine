package com.nandohusni.roomkotlincoroutine

import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.Database



/**
 * Created by nandoseptianhusni on 26/07/18.
 */
//TODO 3
@Database(entities = arrayOf(Product::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract val productDao: ProductDao
}