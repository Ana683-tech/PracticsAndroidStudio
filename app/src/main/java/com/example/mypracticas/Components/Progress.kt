package com.example.mypracticas.Components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.mypracticas.R


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
fun MyProgressAdvance(modifier: Modifier, test: () -> Unit = { }) {
    var progress by remember { mutableFloatStateOf(0.5f) }
    var isLoading by remember { mutableStateOf(false) }
//hace una animacion mucho mas suave para que nuestro progress no haga el cambio de una manera brusca
    val animatedprogress: Float by animateFloatAsState(targetValue = progress)
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (isLoading) {
            CircularProgressIndicator(
                progress = { animatedprogress },
                Modifier.size(150.dp),
                color = Color.Red,
                strokeWidth = 10.dp,
                trackColor = Color.Blue, strokeCap = StrokeCap.Round
            )
        }
        Spacer(Modifier.height(24.dp))
        LinearProgressIndicator(
            progress = { animatedprogress },
            color = Color.Red,
            trackColor = Color.Blue,
            strokeCap = StrokeCap.Round,
            gapSize = 10.dp
        )
        Row(Modifier.padding(20.dp)) {
            Button(onClick = { progress -= 0.1f }, enabled = true) { Text("<-") }
            Spacer(modifier.width(10.dp))
            Button(onClick = { progress += 0.1f }, enabled = true) { Text("->") }
        }
        Button(onClick = { isLoading = !isLoading }, enabled = true) {
            Text("show/hide")
        }
    }
}

@Composable
fun ProgressAnimation(modifier: Modifier) {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.waves))
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LottieAnimation(composition = composition, iterations = LottieConstants.IterateForever)
    }
}