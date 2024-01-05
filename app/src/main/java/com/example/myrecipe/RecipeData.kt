package com.example.myrecipe

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "recipe_table")
data class RecipeData(
    @PrimaryKey(autoGenerate = true)
    var recipeId: Int,

    @ColumnInfo(name = "recipeName")
    var recipeName: String,

    @ColumnInfo(name = "mealType")
    var mealType: String,

    @ColumnInfo(name = "serves")
    var serves: String,

    @ColumnInfo(name = "description ")
    var description: String
)