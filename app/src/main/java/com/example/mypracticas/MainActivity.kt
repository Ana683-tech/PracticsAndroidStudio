package com.example.mypracticas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.mypracticas.Components.MyButtons
import com.example.mypracticas.Components.MyIcon
import com.example.mypracticas.Components.MyImage
import com.example.mypracticas.Components.MyNetworkImage
import com.example.mypracticas.Components.MyProgress
import com.example.mypracticas.Components.MyProgressAdvance
import com.example.mypracticas.Components.ProgressAnimation
import com.example.mypracticas.ui.theme.MyPracticasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyPracticasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProgressAnimation(Modifier.padding(innerPadding))
                }
            }
        }
    }
}
