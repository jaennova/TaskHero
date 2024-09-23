package com.jaennova.taskhero.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaennova.taskhero.ui.screens.home.components.TaskHeader
import com.jaennova.taskhero.ui.screens.home.components.TaskHeroSearchBar
import com.jaennova.taskhero.ui.screens.home.components.CompletedCard
import com.jaennova.taskhero.ui.screens.home.components.OnProgressCard
import com.jaennova.taskhero.ui.screens.home.components.scaffold.TaskHeroBottomBar
import com.jaennova.taskhero.ui.screens.home.components.scaffold.TaskHeroFAB
import com.jaennova.taskhero.ui.screens.home.components.scaffold.TaskHeroTopBar

@Composable
fun MainScreen() {
    Scaffold(
        topBar = { TaskHeroTopBar("Bienvenido!", "Jaen Nova") },
        bottomBar = { TaskHeroBottomBar() },
        floatingActionButton = { TaskHeroFAB() },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            TaskHeroSearchBar()
            Spacer(modifier = Modifier.size(8.dp))
            TaskHeader("En progreso (3)")
            Spacer(modifier = Modifier.size(8.dp))
            OnProgressCard()
            Spacer(modifier = Modifier.size(8.dp))
            TaskHeader("Completadas (3)")
            CompletedCard()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}