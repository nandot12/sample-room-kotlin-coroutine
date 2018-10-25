package com.nandohusni.roomkotlincoroutine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.annotation.SuppressLint
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.async
import org.jetbrains.anko.coroutines.experimental.bg


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //TODO 4 eksekusi di activity

        async(UI){
            bg {
                val product = Product()
                product.id = System.currentTimeMillis()
                product.name = "nando"
                product.image = "image"
                product.price = 1
                val  data = App.database.productDao.create(Product())
            }
        }


// 

    }

    @SuppressLint("StaticFieldLeak")
    fun getProductList() {

        async(UI){
            bg {
              val data =   App.database.productDao.all
                displayProductList(data)
            }
        }
    }

    private fun displayProductList(products: List<Product>) {

    }
}
