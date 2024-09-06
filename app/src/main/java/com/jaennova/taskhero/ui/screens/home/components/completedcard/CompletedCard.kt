package com.jaennova.taskhero.ui.screens.home.components.completedcard

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaennova.taskhero.ui.screens.home.MainScreen

@Composable
fun CompletedCard() {
    LazyColumn(modifier = Modifier.padding(horizontal = 16.dp)) {
        items(5) {
            ItemCompletedCard("Title $it")
        }
    }
}

@Preview
@Composable
fun TaskProjectCardPreview() {
    CompletedCard()
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview2() {
    MainScreen()
}