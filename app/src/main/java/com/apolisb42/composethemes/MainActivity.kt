package com.apolisb42.composethemes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.apolisb42.composethemes.ui.theme.ComposeThemesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    var theme = remember {
        mutableStateOf(false)
    }

    ComposeThemesTheme(darkTheme = theme.value) {
        Column (Modifier.background(MaterialTheme.colorScheme.background)){
            Text(
                text = "Hello World!",
                style = MaterialTheme.typography.headlineMedium
            )

            Button(onClick = {
                theme.value = !theme.value
            }) {
                Text(text = "Change Theme")
            }
        }
    }
}