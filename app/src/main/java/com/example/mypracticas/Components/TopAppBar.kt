@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.mypracticas.Components

import androidx.compose.material3.ExperimentalMaterial3Api
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
fun MyTopAppBar(modifier: Modifier = Modifier) {

    TopAppBar(
        title = { Text("My App") },
        navigationIcon = {
            Icon(
                painter = painterResource(R.drawable.ic_baseline),
                contentDescription = null
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
            containerColor = Color.Blue,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White,
            actionIconContentColor = Color.Red,
            scrolledContainerColor = Color.Black
        )
    )
}