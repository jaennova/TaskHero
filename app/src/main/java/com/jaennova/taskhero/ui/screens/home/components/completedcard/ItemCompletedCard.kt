package com.jaennova.taskhero.ui.screens.home.components.completedcard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaennova.taskhero.ui.screens.home.components.FooterCard
import com.jaennova.taskhero.ui.screens.home.components.HeaderCard

@Composable
fun ItemCompletedCard(title: String) {
    Card(
        modifier = Modifier
            .height(120.dp)
            .width(350.dp)
            .padding(vertical = 8.dp)
            .fillMaxWidth(),
    ) {
        HeaderCard(
            title,
            "Redesign motion graphic...",
            true,
            icon = Icons.Default.CheckCircle
        )
        HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp))
        FooterCard()
    }
}

@Preview
@Composable
fun ItemCompletedCardPreview() {
    ItemCompletedCard("Meeting with client")
}