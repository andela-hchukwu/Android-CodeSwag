package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("Shirts", "shirtimage"),
        Category("Hoodies", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes graphic beanie", "$18", "hat1"),
        Product("Devslopes hat black", "$20", "hat2"),
        Product("Devslopes hat white", "$22", "hat3"),
        Product("Devslopes hat snapback", "$14", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes hoodie gray", "$28", "hoodie1"),
        Product("Devslopes hoodie red", "$32", "hoodie2"),
        Product("Devslopes hoodie blue", "$28", "hoodie3"),
        Product("Devslopes hoodie black", "$38", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes shirt gray", "$18", "shirt1"),
        Product("Devslopes logo shirt red", "$32", "shirt2"),
        Product("Devslopes hustle", "$20", "shirt3"),
        Product("Devslopes badge light gray", "$18", "shirt4"),
        Product("Kickflip studios", "$18", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product> {

        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}