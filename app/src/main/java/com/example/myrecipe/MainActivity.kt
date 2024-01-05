@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.myrecipe

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.myrecipe.data.Recipe
import com.example.myrecipe.ui.theme.MyrecipeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContent {
            MyrecipeTheme {
                 MyApp {
                     startActivity(ProfileActivity.newIntent(this, it))
                 }
            }
        }
    }
}



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyApp(navigateToProfile: (Recipe) -> Unit) {
    Scaffold (
        content = {
            RecipeHomeContent(navigateToProfile = navigateToProfile)
        }
    )
}
