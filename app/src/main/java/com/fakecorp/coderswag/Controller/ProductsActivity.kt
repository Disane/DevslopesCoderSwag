package com.fakecorp.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.fakecorp.coderswag.R
import com.fakecorp.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
