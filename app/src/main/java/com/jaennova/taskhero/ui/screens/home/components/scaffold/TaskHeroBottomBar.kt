package com.jaennova.taskhero.ui.screens.home.components.scaffold

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.jaennova.taskhero.ui.theme.OnPrimary
import com.jaennova.taskhero.ui.theme.OnSecondary
import com.jaennova.taskhero.ui.theme.Primary
import com.jaennova.taskhero.ui.theme.PrimaryContainer

@Composable
fun TaskHeroBottomBar(
    selectedItem: Int = 0,
    onTaskClick: () -> Unit = {},
    onRewardsClick: () -> Unit = {},
    onProfileClick: () -> Unit = {},
    onSettingsClick: () -> Unit = {}
) {
    val iconColor = Primary
    val navItems = listOf(
        NavItem("Tareas", Icons.Filled.Menu, onTaskClick),
        NavItem("Recompensas", Icons.Filled.EmojiEvents, onRewardsClick),
        NavItem("Perfil", Icons.Filled.Person, onProfileClick),
        NavItem("Ajustes", Icons.Filled.Settings, onSettingsClick)
    )

    NavigationBar(
        windowInsets = NavigationBarDefaults.windowInsets,
        containerColor = OnPrimary,
        contentColor = OnSecondary,
    ) {
        navItems.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedItem == index,
                onClick = item.onClick,
                icon = { Icon(item.icon, contentDescription = item.label, tint = iconColor) },
                label = { Text(text = item.label) },
                colors = NavigationBarItemColors(
                    selectedIconColor = OnPrimary,
                    selectedTextColor = Color.Black,
                    selectedIndicatorColor = PrimaryContainer,
                    unselectedIconColor = Primary,
                    unselectedTextColor = Color.Black,
                    disabledIconColor = Primary,
                    disabledTextColor = Primary
                )
            )
        }
    }
}

data class NavItem(
    val label: String,
    val icon: androidx.compose.ui.graphics.vector.ImageVector,
    val onClick: () -> Unit
)

@Preview
@Composable
fun TaskHeroBottomBarPreview() {
    // Preview with dynamic selection
    val selectedItem = remember { mutableIntStateOf(0) }

    TaskHeroBottomBar(
        selectedItem = selectedItem.value,
        onTaskClick = { selectedItem.value = 0 },
        onRewardsClick = { selectedItem.value = 1 },
        onProfileClick = { selectedItem.value = 2 },
        onSettingsClick = { selectedItem.value = 3 }
    )
}
