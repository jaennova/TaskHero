package com.jaennova.taskhero.ui.screens.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ItemOnProgressCard(title: String) {
    Card(
        modifier = Modifier
            .height(200.dp)
            .width(300.dp)
            .padding(horizontal = 8.dp),
    ) {
        HeaderCard(title, "Friday, 08 July 2022")
        HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp))
        ContentOnProgressCard()
    }
}


@Composable
fun ContentOnProgressCard() {
    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
        Text(text = "Description :")
        Text(
            text = "Design a simple home pages with clean\n" +
                    "layout and color based on the guidelines...",
            style = MaterialTheme.typography.bodySmall,
        )
        Spacer(modifier = Modifier.size(8.dp))
        Text(text = "Progress :")
    }
}

@Preview
@Composable
fun ItemOnProgressCardPreview() {
    ItemOnProgressCard("Task Project")
}

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