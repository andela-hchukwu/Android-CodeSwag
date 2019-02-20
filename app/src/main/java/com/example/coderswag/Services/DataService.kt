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
        Product("Devslopes graphic beanie", "$18", "hat01"),
        Product("Devslopes hat black", "$20", "hat02"),
        Product("Devslopes hat white", "$22", "hat03"),
        Product("Devslopes hat snapback", "$14", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes hoodie gray", "$28", "hoodie01"),
        Product("Devslopes hoodie red", "$32", "hoodie02"),
        Product("Devslopes hoodie blue", "$28", "hoodie03"),
        Product("Devslopes hoodie black", "$38", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes shirt gray", "$18", "shirt01"),
        Product("Devslopes logo shirt red", "$32", "shirt02"),
        Product("Devslopes hustle", "$20", "shirt03"),
        Product("Devslopes badge light gray", "$18", "shirt04"),
        Product("Kickflip studios", "$18", "shirt05")
    )
}