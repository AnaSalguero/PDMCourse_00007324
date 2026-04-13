package com.pdmcourse.clase250326

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pdmcourse.clase250326.ui.theme.Clase250326Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Clase250326Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        LemonadeApp(
                            modifier = Modifier.padding(innerPadding),
                        )
                }
            }
        }
    }
}

