package com.example.mypracticas.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp


@Composable
fun MyProgress(modifier: Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(
            Modifier.size(150.dp),
            color = Color.Red,
            strokeWidth = 10.dp,
            trackColor = Color.Blue, strokeCap = StrokeCap.Round
        )
        Spacer(Modifier.height(24.dp))
        LinearProgressIndicator(
            color = Color.Red,
            trackColor = Color.Blue,
            strokeCap = StrokeCap.Round,
            gapSize = 10.dp
        )
    }
}


@Composable
fun MyProgressAdvance(modifier: Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(
            Modifier.size(150.dp),
            color = Color.Red,
            strokeWidth = 10.dp,
            trackColor = Color.Blue, strokeCap = StrokeCap.Round
        )
        Spacer(Modifier.height(24.dp))
        LinearProgressIndicator(
            color = Color.Red,
            trackColor = Color.Blue,
            strokeCap = StrokeCap.Round,
            gapSize = 10.dp
        )
    }
}