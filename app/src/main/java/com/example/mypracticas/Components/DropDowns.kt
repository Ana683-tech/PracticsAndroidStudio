@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.mypracticas.Components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.example.mypracticas.R


@Composable
fun MyExposeDropDownMenu(modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    var selection by remember { mutableStateOf(" ") }
    ExposedDropdownMenuBox(
        modifier = modifier,
        expanded = expanded,
        onExpandedChange = { expanded = !expanded }) {
        TextField(
            value = selection,
            onValueChange = { },
            readOnly = true,
            label = { Text("Idioma") },
            modifier = Modifier
                .menuAnchor()
                .fillMaxWidth(), trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded)
            }

        )
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            DropdownMenuItem(text = { Text("opcion 1 ") }, onClick = {
                selection = "opcion 1"
                expanded = false
            })
            DropdownMenuItem(text = { Text("opcion 2 ") }, onClick = {
                selection = "opcion 2"
                expanded = false
            })
            DropdownMenuItem(text = { Text("opcion 3 ") }, onClick = {
                selection = "opcion 3"
                expanded = false
            })
            DropdownMenuItem(text = { Text("opcion 4 ") }, onClick = {
                selection = "opcion 4"
                expanded = false
            })
            DropdownMenuItem(text = { Text("opcion 5 ") }, onClick = {
                selection = "opcion 5"
                expanded = false
            })
        }
    }
}

@Composable
fun MyDropDownMenu(modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    Box(modifier = modifier) {
        Button(onClick = { expanded = true }) {
            Text("Ver opciones")
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            offset = DpOffset(10.dp, 10.dp),
            properties = PopupProperties(
                focusable = true,
                dismissOnClickOutside = false,
                dismissOnBackPress = false,
                clippingEnabled = false
            )
        ) {
            DropdownMenuItem(text = { Text("opcion 1 ") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("opcion 2 ") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("opcion 3 ") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("opcion 4 ") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("opcion 5 ") }, onClick = { expanded = false })
        }
    }
}

// -----------------------------------------------------------------------------------------------------------
@Composable
fun MyDropDownItem(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        DropdownMenuItem(
            modifier = Modifier.fillMaxWidth(), text = {
                Text("ejemplo 1")
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_emergency),
                    contentDescription = null
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_emergency),
                    contentDescription = null
                )
            },
            enabled = true,
            contentPadding = PaddingValues(start = 30.dp),
            colors = MenuDefaults.itemColors(
                textColor = Color.Red,
                leadingIconColor = Color.Blue,
                trailingIconColor = Color.Yellow,
                disabledTextColor = Color.Red,
                disabledLeadingIconColor = Color.Blue,
                disabledTrailingIconColor = Color.Magenta
            ),
            onClick = {})
    }
}