package com.liebersonsantos.recipescompose.ui.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.liebersonsantos.recipescompose.IngredientCard
import com.liebersonsantos.recipescompose.components.EasyGrid
import com.liebersonsantos.recipescompose.data.Recipe

@Composable
fun IngredientsList(recipe: Recipe) {
    EasyGrid(nColumns = 3, items = recipe.ingredients) {
        IngredientCard(it.image, it.title, it.subtitle, Modifier)
    }

}