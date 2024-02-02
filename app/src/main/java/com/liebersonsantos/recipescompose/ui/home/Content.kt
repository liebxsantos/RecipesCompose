package com.liebersonsantos.recipescompose.ui.home

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import com.liebersonsantos.recipescompose.BasicInfo
import com.liebersonsantos.recipescompose.Description
import com.liebersonsantos.recipescompose.ServingCalculator
import com.liebersonsantos.recipescompose.components.Images
import com.liebersonsantos.recipescompose.components.IngredientsHeader
import com.liebersonsantos.recipescompose.data.Recipe
import com.liebersonsantos.recipescompose.ui.AppBarExpendedHeight

@Composable
fun Content(recipe: Recipe, scrollState: LazyListState) {
    LazyColumn(contentPadding = PaddingValues(top = AppBarExpendedHeight), state = scrollState) {
        item {
            BasicInfo(recipe)
            Description(recipe)
            ServingCalculator()
            IngredientsHeader()
            IngredientsList(recipe)
            ShoppingListButton()
            Reviews(recipe)
            Images()
        }
    }
}