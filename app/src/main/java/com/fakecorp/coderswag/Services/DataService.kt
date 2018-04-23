package com.fakecorp.coderswag.Services

import com.fakecorp.coderswag.Model.Category
import com.fakecorp.coderswag.Model.Product

object DataService {
    val descption: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus tincidunt, velit eu accumsan efficitur, sem urna condimentum velit, id volutpat metus odio ut nisi. Phasellus maximus velit sed dolor consectetur accumsan. Maecenas augue turpis, sodales et vulputate ut, egestas at elit. Etiam eu sagittis odio. Aenean at urna ut nisl volutpat pretium et eget justo. Nulla facilisi. Integer nec nisl gravida, interdum leo sit amet, viverra est. Ut massa lorem, dignissim id nibh maximus, fermentum sagittis nisl. Nullam ac accumsan mi. Nulla at tempor diam. Sed ut tempus est. Nunc aliquet tristique condimentum. Etiam vel erat eu dolor tempor gravida."

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat1", String(descption.toByteArray())),
            Product("Devslopes Hat Black", "$20", "hat2", String(descption.toByteArray())),
            Product("Devslopes Hat White", "$20", "hat3", String(descption.toByteArray())),
            Product("Devslopes Hat Snapback", "$22", "hat4", String(descption.toByteArray())),
            Product("Devslopes Graphic Beanie", "$18", "hat1", String(descption.toByteArray())),
            Product("Devslopes Hat Black", "$20", "hat2", String(descption.toByteArray())),
            Product("Devslopes Hat White", "$20", "hat3", String(descption.toByteArray())),
            Product("Devslopes Hat Snapback", "$22", "hat4", String(descption.toByteArray()))
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie1", String(descption.toByteArray())),
        Product("Devslopes Hoodie Red", "$32", "hoodie2", String(descption.toByteArray())),
        Product("Devslopes Gray Hoodie", "$28", "hoodie3", String(descption.toByteArray())),
        Product("Devslopes Black Hoodie", "$32", "hoodie4", String(descption.toByteArray())),
        Product("Devslopes Hoodie Gray", "$28", "hoodie1", String(descption.toByteArray())),
        Product("Devslopes Hoodie Red", "$32", "hoodie2", String(descption.toByteArray())),
        Product("Devslopes Gray Hoodie", "$28", "hoodie3", String(descption.toByteArray())),
        Product("Devslopes Black Hoodie", "$32", "hoodie4", String(descption.toByteArray()))
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18", "shirt1",String(descption.toByteArray())),
            Product("Devslopes Badge Light Gray", "$20", "shirt2", String(descption.toByteArray())),
            Product("Devslopes Logo Shirt Red", "$22", "shirt3", String(descption.toByteArray())),
            Product("Devslopes Hustle", "$22", "shirt4", String(descption.toByteArray())),
            Product("Kickflip Studios", "$18", "shirt5", String(descption.toByteArray())),
            Product("Devslopes Shirt Black", "$18", "shirt1", String(descption.toByteArray())),
            Product("Devslopes Badge Light Gray", "$20", "shirt2", String(descption.toByteArray())),
            Product("Devslopes Logo Shirt Red", "$22", "shirt3", String(descption.toByteArray())),
            Product("Devslopes Hustle", "$22", "shirt4", String(descption.toByteArray())),
            Product("Kickflip Studios", "$18", "shirt5", String(descption.toByteArray()))
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>
    {
        return when(category)
        {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}