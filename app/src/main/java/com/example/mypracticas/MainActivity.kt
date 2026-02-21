package com.example.mypracticas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.mypracticas.Components.MyRadioButton
import com.example.mypracticas.Components.MyRadioButtonList
import com.example.mypracticas.Components.ParentCheckBoxes
import com.example.mypracticas.Components.TriStateCheckBox
import com.example.mypracticas.ui.theme.MyPracticasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyPracticasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyRadioButtonList(Modifier.padding(innerPadding))
                }
            }
        }
    }
}
