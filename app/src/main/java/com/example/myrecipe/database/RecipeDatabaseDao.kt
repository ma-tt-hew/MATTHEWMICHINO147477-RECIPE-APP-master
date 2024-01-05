package com.example.myrecipe.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Index.Order
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.myrecipe.RecipeData


@Dao
interface RecipeDatabaseDao {
    @Insert
    fun insert(recipe: RecipeData)

    @Update
    fun update(recipe: RecipeData)

    @Query("SELECT * from recipe_table WHERE recipeId = :key")
    fun get(key: Long): RecipeData?

    @Query("DELETE FROM recipe_table")
    fun clear()

    @Query("SELECT * FROM recipe_table ORDER BY recipeId DESC LIMIT 1")
    fun getRecipe() : RecipeData?

    @Query("")
    fun getALLRecipe(): LiveData<List<RecipeData>>
}