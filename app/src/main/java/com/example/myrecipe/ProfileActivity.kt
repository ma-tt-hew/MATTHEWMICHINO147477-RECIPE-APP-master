package com.example.myrecipe

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myrecipe.data.Recipe
import com.example.myrecipe.ui.theme.MyrecipeTheme

class ProfileActivity : AppCompatActivity() {
    private val recipe:Recipe by lazy {
        intent?.getSerializableExtra(RECIPE_ID) as Recipe
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyrecipeTheme {
                RecipeScreen(recipe = recipe)
            }
        }
    }
    companion object {
        private const val RECIPE_ID = "recipe_id"
        fun newIntent(context: Context, recipe: Recipe) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(RECIPE_ID,recipe)
            }
    }
}
