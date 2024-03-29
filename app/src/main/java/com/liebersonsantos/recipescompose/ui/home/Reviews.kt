package com.liebersonsantos.recipescompose.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.liebersonsantos.recipescompose.R
import com.liebersonsantos.recipescompose.data.Recipe
import com.liebersonsantos.recipescompose.ui.theme.DarkGray
import com.liebersonsantos.recipescompose.ui.theme.Pink
import com.liebersonsantos.recipescompose.ui.theme.Transparent

@Composable
fun Reviews(recipe: Recipe) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(text = "Reviews", fontWeight = FontWeight.Bold)
            Text(recipe.reviews, color = DarkGray)
        }
        Button(
            onClick = { /*TODO*/ }, elevation = null, colors = ButtonDefaults.buttonColors(
                backgroundColor = Transparent, contentColor = Pink
            )
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("See all")
                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow_right),
                    contentDescription = null
                )
            }
        }
    }
}