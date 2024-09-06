package com.jaennova.taskhero.ui.screens.home.components.scaffold

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TaskHeroFAB() {
    FloatingActionButton(onClick = { /*TODO*/ }) {
        Icon(imageVector = Icons.Default.Add, contentDescription = null)
    }
}

@Preview
@Composable
fun TaskHeroFABPreview() {
    TaskHeroFAB()
}