package com.liebersonsantos.recipescompose.components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.liebersonsantos.recipescompose.ui.theme.DarkGray
import com.liebersonsantos.recipescompose.ui.theme.LightGray
import com.liebersonsantos.recipescompose.ui.theme.Pink
import com.liebersonsantos.recipescompose.ui.theme.Shapes
import com.liebersonsantos.recipescompose.ui.theme.White

@Composable
fun TabButton(text: String, active: Boolean, modifier: Modifier) {
    Button(
        onClick = { /*TODO*/ },
        shape = Shapes.medium,
        modifier = modifier.fillMaxHeight(),
        elevation = null,
        colors = if (active) ButtonDefaults.buttonColors(
            backgroundColor = Pink,
            contentColor = White
        ) else ButtonDefaults.buttonColors(
            backgroundColor = LightGray,
            contentColor = DarkGray
        )
    ) {
        Text(text)
    }
}