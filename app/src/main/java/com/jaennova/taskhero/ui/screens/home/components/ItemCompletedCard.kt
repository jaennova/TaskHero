package com.jaennova.taskhero.ui.screens.home.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaennova.taskhero.ui.screens.home.MainScreen
import com.jaennova.taskhero.ui.theme.OnSecondary
import com.jaennova.taskhero.ui.theme.Primary

@Composable
fun ItemCompletedCard(
    title: String,
    dateTime: String,
    icon: ImageVector = Icons.Default.CheckCircle
) {
    Card(
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(1.dp, Primary),
        modifier = Modifier
            .height(80.dp)
            .width(350.dp)
            .padding(top = 8.dp, bottom = 8.dp, start = 4.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = OnSecondary,
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier
                    .weight(0.2f)
                    .size(36.dp),
                tint = Primary
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium,
                )
                Text(
                    text = dateTime,
                    style = MaterialTheme.typography.labelSmall,
                )
            }
        }
//        HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp))
//        FooterCard()
    }
}

@Preview
@Composable
fun ItemCompletedCardPreview() {
    ItemCompletedCard("Meeting with client", "Friday, 08 July 2022")
}

@Composable
fun CompletedCard() {
    LazyColumn(modifier = Modifier.padding(horizontal = 16.dp)) {
        items(10) {
            ItemCompletedCard("Task ${it + 1}", "Friday, 08 July 2022")
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