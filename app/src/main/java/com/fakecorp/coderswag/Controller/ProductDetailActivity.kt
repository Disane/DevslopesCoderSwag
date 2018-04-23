package com.fakecorp.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.fakecorp.coderswag.Model.Product
import com.fakecorp.coderswag.R
import com.fakecorp.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)

        // lookup image ID based on resource name
        val resourceId = this.resources.getIdentifier(product.image, "drawable", this.packageName)

        // display Item in the ProductDetailActivity
        // set image to product image
        productDetailImage?.setImageResource(resourceId)
        // show product item details
        productDetailDetails?.text = product.description
        // show product item name
        productDetailName?.text = product.title
        // show product item price
        productDetailPrice?.text = product.price
    }
}
