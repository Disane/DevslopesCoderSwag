package com.fakecorp.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.fakecorp.coderswag.Adapters.ProductsAdapter
import com.fakecorp.coderswag.R
import com.fakecorp.coderswag.Services.DataService
import com.fakecorp.coderswag.Utilities.EXTRA_CATEGORY
import com.fakecorp.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product.*

class ProductsActivity : AppCompatActivity()
{
    lateinit var adapter : ProductsAdapter
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        // pass the product object from the ProductsActivity to the new ProductDetailActivity
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType)){ product ->
            val productDetailIntent = Intent(this, ProductDetailActivity::class.java)
            productDetailIntent.putExtra(EXTRA_PRODUCT, product)
            startActivity(productDetailIntent)
        }

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if(screenSize > 720)
        {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter
    }
}
