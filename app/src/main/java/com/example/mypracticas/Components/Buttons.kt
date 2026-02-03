package com.example.mypracticas.Components

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButtons(modifier: Modifier) {
    Column(modifier = modifier) {
        Button(
            onClick = { Log.i("Ana", "boton pulsado") },
            enabled = true,
            shape = RoundedCornerShape(30.dp),
            border = BorderStroke(4.dp, Color.DarkGray),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Black,
                disabledContentColor = Color.Black,
                disabledContainerColor = Color.White
            )
        ) {
            Text("Ana")
        }
        OutlinedButton(
            onClick = { },
            enabled = true,
            shape = RoundedCornerShape(30.dp),
            border = BorderStroke(2.dp, Color.Magenta),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Magenta,
                containerColor = Color.Black,
                disabledContentColor = Color.Black,
                disabledContainerColor = Color.Magenta
            )
        ) {
            Text("Patricia")
        }
        TextButton(onClick = { }, enabled = true, border = BorderStroke(1.dp, Color.Red)) {
            Text("Castillo")
        }
        ElevatedButton(
            onClick = { }, enabled = true, elevation = ButtonDefaults.elevatedButtonElevation(
                defaultElevation = 50.dp,
            )
        ) { Text("Medina") }

        FilledTonalButton(onClick = { }, enabled = true) {
            Text("otorrinolaringologo")
        }
        Button(onClick = { }, enabled = true) { Text("hello") }
    }
}