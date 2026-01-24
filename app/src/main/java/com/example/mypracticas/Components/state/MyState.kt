package com.example.mypracticas.Components.state

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MyState(modifier: Modifier) {

    Column(modifier) {
        var number by rememberSaveable { mutableIntStateOf(0) }
        StateExaple1(number) { number += 1 }
        StateExaple2(number) { number += 1 }
    }
}

@Composable
fun StateExaple1(number: Int, onclick: () -> Unit) {

    Text("pulsame: $number", modifier = Modifier.clickable { onclick() })
}

@Composable
fun StateExaple2(number: Int, onclick: () -> Unit) {

    Text("pulsame: $number", modifier = Modifier.clickable { onclick() })
}