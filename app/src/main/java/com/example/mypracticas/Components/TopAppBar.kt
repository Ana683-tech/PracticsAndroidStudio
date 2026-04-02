@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.mypracticas.Components

import androidx.compose.foundation.clickable
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.mypracticas.R

@Composable
fun MyTopAppBar(modifier: Modifier = Modifier,onNavSelected:() -> Unit) {

    TopAppBar(
        title = { Text("My App") },
        navigationIcon = {
            Icon(
                painter = painterResource(R.drawable.ic_baseline),
                contentDescription = null,
                modifier = Modifier.clickable{onNavSelected()}
            )
        },
        actions = {
            Icon(
                painter = painterResource(R.drawable.ic_baseline),
                contentDescription = null,
                tint = Color.White
            )
            Icon(
                painter = painterResource(R.drawable.ic_baseline),
                contentDescription = null,
                tint = Color.White
            )
            Icon(
                painter = painterResource(R.drawable.ic_baseline),
                contentDescription = null,
                tint = Color.White
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Red,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White,
            actionIconContentColor = Color.White,
            scrolledContainerColor = Color.Black
        )
    )
}
