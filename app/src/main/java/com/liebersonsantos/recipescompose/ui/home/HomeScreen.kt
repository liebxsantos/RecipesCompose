package com.liebersonsantos.recipescompose.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import com.liebersonsantos.recipescompose.Content
import com.liebersonsantos.recipescompose.data.Recipe

@Composable
fun HomeScreen(recipe: Recipe) {
    val scrollState = rememberLazyListState()

    Box {
        Content(recipe, scrollState)
        ParallaxToolbar(recipe, scrollState)
    }
}