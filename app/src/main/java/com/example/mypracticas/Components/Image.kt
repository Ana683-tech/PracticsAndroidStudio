package com.example.mypracticas.Components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.mypracticas.R

@Composable
fun MyImage(modifier: Modifier) {
    Image(
        painter = painterResource(R.drawable.graciosa),
        contentDescription = "image profile",
        modifier = modifier
            .size(300.dp)
            .clip(RoundedCornerShape(50))
            .border(
                width = 5.dp,
                shape = CircleShape, brush = Brush.linearGradient(
                    colors = listOf(Color.Black, Color.White)
                )
            ),
        contentScale = ContentScale.FillBounds
    )
}


@Composable
fun MyNetworkImage(modifier: Modifier) {
    AsyncImage(
        modifier = modifier.size(450.dp),
        model = "https://imgs.search.brave.com/E2NgIK1TNQ-r7ohyPDpAlBuaSSz1-vDHfMKtr8htASM/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9tYXJr/ZXRwbGFjZS5jYW52/YS5jb20vcGdxTUUv/TUFFRUlPcGdxTUUv/MS90bC9jYW52YS1j/dXJpb3MtY2F0LU1B/RUVJT3BncU1FLmpw/Zw",
        contentDescription = "Image from network",
        onError = {
            Log.i("image", "ha courrido un error ${it.result.throwable.message}")
        }
    )
}

@Composable
fun MyIcon(modifier: Modifier) {
    Icon(
        modifier = modifier.size(400.dp),
        painter = painterResource(R.drawable.ic_baseline),
        tint = Color.Magenta,
        contentDescription = "foto de pareja"
    )
}