package com.jaennova.taskhero.ui.screens.home.components.scaffold

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskHeroTopBar(welcomeMessage: String, username: String) {
    TopAppBar(
        modifier = Modifier.padding(top = 10.dp, start = 10.dp, end = 10.dp),
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Image(imageVector = Icons.Default.Face, contentDescription = null)
            }
        },
        title = {
            Column {
                Text(
                    text = welcomeMessage,
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = username,
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.tertiary
                )
            }
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.Notifications,
                    contentDescription = null
                )
            }
        }
    )
}

@Preview
@Composable
fun TaskHeroTopBarPreview() {
    TaskHeroTopBar("Welcome back!", "Jaen Nova")
}