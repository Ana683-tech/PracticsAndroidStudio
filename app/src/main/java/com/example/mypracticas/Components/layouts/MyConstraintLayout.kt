package com.example.mypracticas.Components.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyBasicConstraintLayout(modifier: Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxGreen, boxCyan, boxMagenta, boxBlue) = createRefs()
        Box(
            Modifier
                .size(140.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(boxBlue.bottom)
                    start.linkTo(boxBlue.end)
                })
        Box(
            Modifier
                .size(140.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    top.linkTo(boxBlue.bottom)
                    end.linkTo(boxBlue.start)
                })
        Box(
            Modifier
                .size(140.dp)
                .background(Color.Cyan)
                .constrainAs(boxCyan) {
                    bottom.linkTo(boxBlue.top)
                    start.linkTo(boxBlue.end)
                })
        Box(
            Modifier
                .size(140.dp)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    bottom.linkTo(boxBlue.top)
                    end.linkTo(boxBlue.start)
                })
        Box(
            Modifier
                .size(140.dp)
                .background(Color.Blue)
                .constrainAs(boxBlue) {
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                })
    }
}