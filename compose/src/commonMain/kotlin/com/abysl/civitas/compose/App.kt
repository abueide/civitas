package com.abysl.civitas.compose
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    val test = TestStuff("Test");

    MaterialTheme {
        Button(onClick = {
            text = "Hello, ${getPlatformName()}"
        }) {
            Text(text)
        }
    }
}
