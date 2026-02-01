package com.example.mypracticas.Components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MyTextFieldParent(modifier: Modifier) {
    var user: String by remember { mutableStateOf("Ana") }
    var value: String by remember { mutableStateOf(" ") }
    Column(modifier = modifier) {
        MyTextField(user = user) { user = it }
        MySecondTextField(value = value) { value = it }
        MyAbvanceTextField(value = value) { value = it }
        MyPasswordTextField(value = value) { value = it }
    }
}

@Composable
fun MyTextField(user: String, onUserChange: (String) -> Unit) {
    TextField(user, onValueChange = { onUserChange(it) }, readOnly = user.isEmpty())
}

@Composable
fun MySecondTextField(value: String, onValueChange: (String) -> Unit) {
    TextField(
        value,
        onValueChange = { onValueChange(it) },
        placeholder = { Text("Agrega tu correo") },
        label = { Text("Correo") })
}


//por ley siempre es el label o un placeholder o es uno o es otro ya que ambos no se puede


@Composable
fun MyAbvanceTextField(value: String, onValueChange: (String) -> Unit) {
    TextField(
        value, onValueChange = {
            //   if (it.contains("a")) {
            onValueChange(it.replace("a", " "))
            //   } else {
            //    onValueChange(it)
            //   }
        })
}


@Composable
fun MyPasswordTextField(value: String, onValueChange: (String) -> Unit) {
    var passwordHidden: Boolean by remember { mutableStateOf(false) }
    TextField(
        value,
        onValueChange = { onValueChange(it) },
        singleLine = true,
        label = { Text("Introduce tu contrasena") },

    )
}