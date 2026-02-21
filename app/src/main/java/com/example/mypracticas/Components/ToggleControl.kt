package com.example.mypracticas.Components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import com.example.mypracticas.Components.state.CheckBoxState
import com.example.mypracticas.R
import kotlinx.coroutines.selects.select

@Composable
fun MySwitch(modifier: Modifier = Modifier) {
    var switchState by remember { mutableStateOf(true) }
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Switch(
            checked = switchState, onCheckedChange = { switchState = it }, thumbContent = {
                Icon(
                    painter = painterResource(R.drawable.ic_baseline), contentDescription = null
                )
            },

            colors = SwitchDefaults.colors(
                //bolita
                checkedThumbColor = Color.Red,
                uncheckedThumbColor = Color.Blue,
                disabledCheckedThumbColor = Color.Yellow,
                disabledUncheckedThumbColor = Color.Cyan,
                //icono
                checkedIconColor = Color.Green,
                uncheckedIconColor = Color.Cyan,
                disabledUncheckedIconColor = Color.Red,
                disabledCheckedIconColor = Color.Red,
                //border
                checkedBorderColor = Color.Magenta,
                uncheckedBorderColor = Color.Magenta,
                disabledCheckedBorderColor = Color.Magenta,
                disabledUncheckedBorderColor = Color.Magenta,
                //track
                checkedTrackColor = Color.White,
                uncheckedTrackColor = Color.Black,
                disabledCheckedTrackColor = Color.White,
                disabledUncheckedTrackColor = Color.Black
            )
        )
    }
}

@Composable
fun MyCheckBox(modifier: Modifier = Modifier) {
    var state by remember { mutableStateOf(true) }
    Box(modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { state = !state }) {
            Checkbox(
                checked = state, onCheckedChange = { state = it }, colors = CheckboxDefaults.colors(
                    checkedColor = Color.Magenta,
                    uncheckedColor = Color.Blue,
                    checkmarkColor = Color.White,
                    disabledCheckedColor = Color.Red,
                    disabledUncheckedColor = Color.Black,
                    disabledIndeterminateColor = Color.Green
                )
            )
            Spacer(Modifier.width(12.dp))
            Text("Acepto terminos y condiciones")
        }
    }
}

//------------------------------------------de aqui para abajo es uno ------------------------------------------
@Composable
fun ParentCheckBoxes(modifier: Modifier = Modifier) {
    var state by remember {
        mutableStateOf(
            listOf(
                CheckBoxState("terms", "Aceptar los terminos y condiciones"),
                CheckBoxState("newsletter", "Recibir las newsletter", true),
                CheckBoxState("updates", "Recibir las updates")

            )
        )
    }
    Column(modifier = modifier.fillMaxSize()) {
        state.forEach { myState ->
            CheckBoxWithText(checkBoxState = myState) {
                state = state.map {
                    if (it.id == myState.id) {
                        myState.copy(checked = !myState.checked)
                    } else {
                        it
                    }
                }
            }
        }
    }
}


@Composable
fun CheckBoxWithText(
    modifier: Modifier = Modifier,
    checkBoxState: CheckBoxState,
    onCheckedChange: (CheckBoxState) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable { onCheckedChange(checkBoxState) }) {
        Checkbox(
            checked = checkBoxState.checked,
            onCheckedChange = { onCheckedChange(checkBoxState) },
            enabled = true
        )
        Spacer(Modifier.width(12.dp))
        Text(checkBoxState.label)
    }
}

//-------------------------------------de aqui para arriba es uno ---------------------------------------------

@Composable
fun TriStateCheckBox(modifier: Modifier = Modifier) {
    var state by remember { mutableStateOf(ToggleableState.Off) }
    var child1 by remember { mutableStateOf(false) }
    var child2 by remember { mutableStateOf(false) }
    LaunchedEffect(child1, child2) {
        state = when {
            child1 && child2 -> ToggleableState.On
            !child1 && !child2 -> ToggleableState.Off
            else -> ToggleableState.Indeterminate
        }
    }
    Column(modifier = modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            TriStateCheckbox(state, onClick = {
                val newState = state != ToggleableState.On
                child1 = newState
                child2 = child1
            })
            Text(" seleccionar todo")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Checkbox(child1, onCheckedChange = { child1 = it })
            Text(" Ejemplo 1")
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Checkbox(child2, onCheckedChange = { child2 = it })
            Text(" ejemplo 2")
        }

    }
}

@Composable
fun MyRadioButton(modifier: Modifier = Modifier) {
    var state by remember { mutableStateOf(false) }
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = state,
            onClick = { state = true },
            enabled = false,
            colors = RadioButtonDefaults.colors(
                selectedColor = Color.Red,
                unselectedColor = Color.Yellow,
                disabledSelectedColor = Color.Green,
                disabledUnselectedColor = Color.Magenta
            )
        )
        Text("ejemplo 1")
    }
}
//-----------------------------------------------------------------------
@Composable
fun MyRadioButtonList(modifier: Modifier = Modifier) {
    var selectedName by remember { mutableStateOf("") }

    Column(modifier = modifier) {
        RadioButtonComponent("Ana", selectedName = selectedName) { selectedName = it }
        RadioButtonComponent("Patricia", selectedName = selectedName) { selectedName = it }
        RadioButtonComponent("Castillo", selectedName = selectedName) { selectedName = it }
        RadioButtonComponent("Medina", selectedName = selectedName) { selectedName = it }
    }
}

@Composable
fun RadioButtonComponent(name: String, selectedName: String, onItemSelected: (String) -> Unit) {
    Row(
        modifier = Modifier.clickable { onItemSelected(name) },
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(selected = name == selectedName, onClick = { onItemSelected(name) })
        Text(name)
    }
}