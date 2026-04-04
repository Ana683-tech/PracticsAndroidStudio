package com.example.mypracticas.Components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Badge
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.mypracticas.Components.model.DrawerItem


@Composable
fun MyModalDrawer(drawerState: DrawerState, content: @Composable () -> Unit) {
    val myItems = listOf(
        DrawerItem(title = "Home", icon = Icons.Default.Home, notification = 5),
        DrawerItem(title = "Fav", icon = Icons.Default.Favorite, notification = 0),
        DrawerItem(title = "Build", icon = Icons.Default.Build, notification = 5),
        DrawerItem(title = "Call", icon = Icons.Default.Call, notification = 8),
    )
    var selectedIndex by remember { mutableIntStateOf(0) }
    ModalNavigationDrawer(
        drawerState = drawerState, drawerContent = {
            ModalDrawerSheet(
                drawerShape = RoundedCornerShape(topEndPercent = 20, bottomEndPercent = 0),
                drawerContentColor = Color.Red,
                drawerContainerColor = Color.White,
                drawerTonalElevation = 10.dp
            ) {
                Spacer(Modifier.height(24.dp))
                myItems.forEachIndexed { index, drawerItem ->
                    NavigationDrawerItem(
                        label = { Text(drawerItem.title) },
                        onClick = {
                            selectedIndex = index
                        },//linea que esta igualando en que si esta secleccionado
                        selected = selectedIndex == index,//linea que verifica que si o si este seleccionado
                        icon = {
                            Icon(
                                imageVector = drawerItem.icon, contentDescription = null
                            )
                        },
                        badge = {
                            if (drawerItem.notification > 0) {
                                Badge(
                                    containerColor = if (selectedIndex == index) Color.White else Color.Red,//linea que se encarga de hacer el cambio de color en la notificacion
                                    contentColor = if (selectedIndex == index) Color.Red else Color.White//linea que tambien hace el cambio de la notificacion
                                ) { Text(drawerItem.notification.toString()) }
                            }
                        },
                        shape = RoundedCornerShape(20),
                        colors = NavigationDrawerItemDefaults.colors(
                            selectedContainerColor = Color.Red,
                            selectedIconColor = Color.White,
                            selectedTextColor = Color.White,
                            selectedBadgeColor = Color.White,
                            unselectedContainerColor = Color.White,
                            unselectedIconColor = Color.Red,
                            unselectedTextColor = Color.Red,
                            unselectedBadgeColor = Color.Red

                        )
                    )
                    Spacer(Modifier.height(10.dp))
                }
            }
        }, scrimColor = Color.Red.copy(alpha = 0.3f)
    ) {
        content()
    }
}