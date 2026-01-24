package com.example.mypracticas.Components.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable

fun MyRow(modifier: Modifier) {
    Row(modifier = modifier.fillMaxSize().horizontalScroll(rememberScrollState()), horizontalArrangement = Arrangement.SpaceAround) {
        Text("Hola 1",modifier.background(Color.Red))
        Text("Hola 2",modifier.background(Color.Magenta))
        Text("Hola 3",modifier.background(Color.Yellow))
        Text("Hola 4",modifier.background(Color.Green))
        Text("Hola 1",modifier.background(Color.Red))
        Text("Hola 2",modifier.background(Color.Magenta))
        Text("Hola 3",modifier.background(Color.Yellow))
        Text("Hola 4",modifier.background(Color.Green))
        Text("Hola 1",modifier.background(Color.Red))
        Text("Hola 2",modifier.background(Color.Magenta))
        Text("Hola 3",modifier.background(Color.Yellow))
        Text("Hola 4",modifier.background(Color.Green))
        Text("Hola 1",modifier.background(Color.Red))
        Text("Hola 2",modifier.background(Color.Magenta))
        Text("Hola 3",modifier.background(Color.Yellow))
        Text("Hola 4",modifier.background(Color.Green))
        Text("Hola 1",modifier.background(Color.Red))
        Text("Hola 2",modifier.background(Color.Magenta))
        Text("Hola 3",modifier.background(Color.Yellow))
        Text("Hola 4",modifier.background(Color.Green))
        Text("Hola 1",modifier.background(Color.Red))
        Text("Hola 2",modifier.background(Color.Magenta))
        Text("Hola 3",modifier.background(Color.Yellow))
        Text("Hola 4",modifier.background(Color.Green))
    }
}