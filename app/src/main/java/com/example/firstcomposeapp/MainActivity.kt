package com.example.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstcomposeapp.ui.theme.FirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
private fun MyApp(names: List<String> = listOf("Leonardo", "Edson")){
    Column {
        names.map { Greeting(name = it) }
    }
    
}

@Composable
fun Greeting(name: String) {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(24.dp)
        ) {
        Row(modifier = Modifier.padding(horizontal = 24.dp)){
            Column(modifier = Modifier.weight(1f))
                {
                Text(text = "Hello!")
                Text(text = name)
            }
            OutlinedButton(onClick = { }) {
                Text(text = "Show more")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstComposeAppTheme {
        Greeting("Android")
    }
}