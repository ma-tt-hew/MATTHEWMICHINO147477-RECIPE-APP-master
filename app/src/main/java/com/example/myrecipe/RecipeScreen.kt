package com.example.myrecipe

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import com.example.myrecipe.data.Recipe

@Composable
fun RecipeScreen(recipe: Recipe) {
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints {
            Surface {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState),
                ) {
                    RecipeHeader(
                        recipe,
                        this@BoxWithConstraints.maxHeight
                    )
                    RecipeContent(recipe = recipe,
                        containerHeight = this@BoxWithConstraints.maxHeight
                    )

                }
            }
        }
    }
}
@Composable
private fun RecipeHeader(
    recipe: Recipe,
    containerHeight: Dp
){
    Image(
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxWidth(),
        painter = painterResource(id = recipe.recipeImageId),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
private fun RecipeContent(recipe: Recipe, containerHeight: Dp) {
    Column {
        //TODO
        Title(recipe = recipe)
        RecipeProperty(stringResource(R.string.meal_type), recipe.meal )
        RecipeProperty(stringResource(R.string.serves), recipe.serves)
        RecipeProperty(stringResource(R.string.describe), recipe.description)
        Spacer(Modifier.height((containerHeight - (-1300).dp)))
    }
}

@Composable
private fun Title(recipe: Recipe) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = recipe.title,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )
    }
}
@Composable
fun RecipeProperty(label: String, value: String) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        Divider(modifier = Modifier.padding(bottom = 4.dp))
        Text(
            text = label,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.labelLarge,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = value,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.bodyLarge,
            overflow = TextOverflow.Visible
        )
    }
}