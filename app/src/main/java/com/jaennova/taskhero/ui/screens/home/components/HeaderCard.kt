package com.jaennova.taskhero.ui.screens.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@Composable
fun HeaderCard(
    title: String,
    subtitle: String,
    completed: Boolean = false,
    icon: ImageVector = Icons.Default.Person
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.padding(top = 8.dp)
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                textDecoration = if (completed) TextDecoration.LineThrough else null
            )
            Text(
                text = subtitle,
                style = MaterialTheme.typography.labelSmall,
            )
        }
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.weight(0.4f)
        )
    }}