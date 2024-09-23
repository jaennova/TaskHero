package com.jaennova.taskhero.ui.screens.home.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaennova.taskhero.ui.theme.OnSecondary
import com.jaennova.taskhero.ui.theme.Primary

@Composable
fun ItemOnProgressCard(title: String) {
    Card(
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(1.dp, Primary),
        modifier = Modifier
            .height(170.dp)
            .width(350.dp)
            .padding(start = 16.dp, end = 4.dp),
        colors = CardDefaults.cardColors(
            containerColor = OnSecondary,
        )
    ) {
        HeaderCard(title, "Friday, 08 July 2022")
        HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp))
        ContentOnProgressCard()
    }
}


@Composable
fun ContentOnProgressCard() {
    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                    " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                    " Ut enim ad minim veniam, quis nostrud exercitation ullamco",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .padding(top = 8.dp)
                .weight(0.2f)
        )
      /*  Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(top = 8.dp)
                .weight(0.15f)
        ) {
            Icon(
                imageVector = Icons.Default.Bookmarks,
                contentDescription = null,
                tint = Primary
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(text = "Tags")
            Spacer(modifier = Modifier.size(8.dp))
            FilterChip(
                selected = true,
                onClick = { },
                label = { Text(text = "Lorem", fontSize = 8.sp) })
        }*/
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