package com.example.coderswag.services

import com.example.coderswag.models.Category
import com.example.coderswag.models.Product

object DataServices {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", " hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$22", "hat3"),
        Product("Devslopes Hat Snapback", "$24", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$18", "hoodie1"),
        Product("Devslopes Hoodie Red", "$20", "hoodie2"),
        Product("Devslopes Gray Hoodie", "$22", "hoodie3"),
        Product("Devslopes Black Hoodie", "$24", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt1"),
        Product("Devslopes Badge Light Gray ", "$20", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
        Product("Devslopes Hustle", "$24", "shirt4"),
        Product("Kickflip Studios", "$26", "shirt5")
    )
}

