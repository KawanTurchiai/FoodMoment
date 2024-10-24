package com.example.appcomida

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.appcomida.ui.theme.AppcomidaTheme
import com.example.appcomida.ui.theme.Cinzatest
import com.example.appcomida.ui.theme.Purple40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppcomidaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Kawan",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Hello aaaaa $name!",
            modifier = modifier,
            color = Cinzatest
            
        )
        Image(painter = painterResource(id = R.drawable.burguer), contentDescription = "burguer")
        Text(
            text = "Kawan test",
            modifier = modifier,
            color = Cinzatest
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppcomidaTheme {
        Greeting("Kawan")

    }
}