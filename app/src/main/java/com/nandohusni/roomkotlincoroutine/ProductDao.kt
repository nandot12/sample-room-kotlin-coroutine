package com.nandohusni.roomkotlincoroutine

import android.arch.persistence.room.*


/**
 * Created by nandoseptianhusni on 26/07/18.
 */

//TODO 3 Bikin query untuk manipulasi database
@Dao
interface ProductDao {
    @get:Query("SELECT * FROM product")
    val all: List<Product>

//    @Query("SELECT * FROM product WHERE id = :id")
//    fun getAll(id: Long): Product

    @Insert
    fun create(product: Product)

    @Update
    fun update(product: Product)

    @Delete
    fun delete(product: Product)
}