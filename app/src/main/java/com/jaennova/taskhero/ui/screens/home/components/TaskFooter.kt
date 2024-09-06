package com.jaennova.taskhero.ui.screens.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FooterCard() {
    Row {
        Column(
            modifier = Modifier
                .padding(start = 16.dp)
                .weight(1f)
        ) {
            Text(
                "01 July 2022",
                style = MaterialTheme.typography.labelSmall
            )
        }
        Column(
            modifier = Modifier
                .padding(start = 8.dp)
                .weight(0.25f)
        ) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = null,
            )
        }
    }
}