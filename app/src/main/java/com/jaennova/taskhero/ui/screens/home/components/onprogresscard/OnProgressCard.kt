package com.jaennova.taskhero.ui.screens.home.components.onprogresscard

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun OnProgressCard() {
    LazyRow {
        items(3) {
            ItemOnProgressCard("Title $it")
        }
    }
}

@Preview
@Composable
fun OnProgressCardPreview() {
    OnProgressCard()
}