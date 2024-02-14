package com.example.oamk_mobilenative_assignment8_oliver_kern.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.oamk_mobilenative_assignment8_oliver_kern.ui.composables.TodoScreen
import com.example.oamk_mobilenative_assignment8_oliver_kern.ui.theme.Oamk_mobileNative_assignment8_oliver_kernTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Oamk_mobileNative_assignment8_oliver_kernTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TodoScreen()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Oamk_mobileNative_assignment8_oliver_kernTheme {
        TodoScreen()
    }
}