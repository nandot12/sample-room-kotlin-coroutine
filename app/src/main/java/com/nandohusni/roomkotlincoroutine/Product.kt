package com.nandohusni.roomkotlincoroutine

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey



/**
 * Created by nandoseptianhusni on 26/07/18.
 */
//TODO 2 bikin field name table
@Entity
class Product {
    @PrimaryKey
    var id: Long = 0
    @ColumnInfo(name = "name")
    var name: String? = null
    @ColumnInfo(name = "image")
    var image: String? = null
    @ColumnInfo(name = "price")
    var price: Int = 0
}