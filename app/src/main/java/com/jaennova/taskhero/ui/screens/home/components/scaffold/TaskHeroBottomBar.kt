package com.jaennova.taskhero.ui.screens.home.components.scaffold

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TaskHeroBottomBar() {
    NavigationBar(windowInsets = NavigationBarDefaults.windowInsets) {
        NavigationBarItem(
            selected = true,
            onClick = { /*TODO*/ },
            icon = { Icon(Icons.Filled.Menu, contentDescription = null) },
            label = { Text(text = "Tareas") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = { Icon(Icons.Filled.Star, contentDescription = null) },
            label = { Text(text = "Recompensas") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = { Icon(Icons.Filled.Person, contentDescription = null) },
            label = { Text(text = "Perfil") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = { Icon(Icons.Filled.Settings, contentDescription = null) },
            label = { Text(text = "Ajustes") }
        )

    }
}

@Preview
@Composable
fun TaskHeroBottomBarPreview() {
    TaskHeroBottomBar()
}