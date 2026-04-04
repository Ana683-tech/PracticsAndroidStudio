package com.example.mypracticas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.mypracticas.Components.MyElevatedCard
import com.example.mypracticas.Components.MyOutlinedCard
import com.example.mypracticas.ui.theme.MyPracticasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyPracticasTheme {
//                val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
//                val snackBarHostState = remember { SnackbarHostState() }
//                val scope = rememberCoroutineScope()
//                MyModalDrawer(drawerState) {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
//                    topBar = { MyTopAppBar { scope.launch { drawerState.open() } } },
//                    snackbarHost = { SnackbarHost(hostState = snackBarHostState) },
//                    floatingActionButton = { MyFAB() },
//                    floatingActionButtonPosition = FabPosition.Center,
//                    bottomBar = { MyNavigationBar() }
                )
                { innerPadding ->
                    MyOutlinedCard(Modifier.padding(innerPadding))
//                        Box(
//                            modifier = Modifier
//                                .fillMaxSize()
//                                .padding(innerPadding)
//                                .background(Color.Magenta),
//                            contentAlignment = Alignment.Center
//                        ) {
//                            Text("Esta es mi screen", modifier = Modifier.clickable {
//                                scope.launch {
//                                    val result = snackBarHostState.showSnackbar(
//                                        message = "ejemplo",
//                                        actionLabel = "Deshacer "
//                                    )
//                                    if (result == SnackbarResult.ActionPerformed) {
//                                        // pulso deshacer
//                                    } else {
//                                        //no hizo nada
//                                    }
//                                }
//                            })
//                        }
                }
            }
        }
    }
}
