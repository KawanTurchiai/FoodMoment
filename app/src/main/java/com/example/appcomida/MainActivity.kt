package com.example.appcomida

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appcomida.ui.theme.AppcomidaTheme
import kotlin.random.Random


val backgroud = Color(0xFFF2F0DA)
val botao = Color(0xFFCB8718)
val texto = Color(0xFF8F2518)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppcomidaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    App(
                        name = "Teste", modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun App(name: String, modifier: Modifier = Modifier) {
    val sorteio = remember { mutableStateOf(1) }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = backgroud)
    ){
                Text(
                    text = "Roleta de Comida",
                    color = texto,

                    fontSize = 28.sp,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .align(Alignment.TopCenter)
                )


                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Image(
                        painter = painterResource(R.drawable.seta),
                        contentDescription = "seta",
                        modifier = Modifier
                            .size(50.dp)



                        )
                    ChooseImage(sorteio)


                    Button(
                        colors = ButtonDefaults.buttonColors(botao),
                        onClick = { sorteio.value = Random.nextInt(1, 9) },
                        modifier = Modifier
                            .padding(top = 25.dp)
                            .size(width = 120.dp, height = 40.dp)

                    ) {
                        Text(
                            text = "Sorteio", fontSize = 15.sp, color = backgroud,fontWeight = FontWeight.Black,


                        )

                    }
                }
            }
}

@Composable
fun ChooseImage(sorteio: androidx.compose.runtime.MutableState<Int>) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(15.dp)
    ) {
        when (sorteio.value) {
            1 -> {
                Image(
                    painter = painterResource(R.drawable.cachorroquente),
                    contentDescription = "Cachorro Quente",
                    modifier = Modifier.size(250.dp)
                )
                Text("Cachorro Quente", fontSize = 20.sp,modifier = Modifier
                    .padding(top = 25.dp),color = texto,fontWeight = FontWeight.Black,)

            }

            2 -> {
                Image(
                    painter = painterResource(R.drawable.churrasco),
                    contentDescription = "Churrasco",
                    modifier = Modifier.size(250.dp)
                )
                Text("Churrasco", fontSize = 20.sp,modifier = Modifier
                    .padding(top = 25.dp),color = texto,fontWeight = FontWeight.Black)

            }

            3 -> {
                Image(
                    painter = painterResource(R.drawable.hamburguer),
                    contentDescription = "Hamburguer",
                    modifier = Modifier.size(250.dp)
                )
                Text("Hamburguer", fontSize = 20.sp,modifier = Modifier
                    .padding(top = 25.dp),color = texto,fontWeight = FontWeight.Black)
            }

            4 -> {
                Image(
                    painter = painterResource(R.drawable.lasanha),
                    contentDescription = "Lasanha",
                    modifier = Modifier.size(250.dp)
                )
                Text("Lasanha", fontSize = 20.sp,modifier = Modifier
                    .padding(top = 25.dp),color = texto,fontWeight = FontWeight.Black)
            }

            5 -> {
                Image(
                    painter = painterResource(R.drawable.pastel),
                    contentDescription = "Pastel",
                    modifier = Modifier.size(250.dp)
                )
                Text("Pastel", fontSize = 20.sp,modifier = Modifier
                    .padding(top = 25.dp),color = texto,fontWeight = FontWeight.Black)
            }

            6 -> {
                Image(
                    painter = painterResource(R.drawable.pizza),
                    contentDescription = "Pizza",
                    modifier = Modifier.size(250.dp)
                )
                Text("Pizza", fontSize = 20.sp,modifier = Modifier
                    .padding(top = 25.dp),color = texto,fontWeight = FontWeight.Black)
            }

            7 -> {
                Image(
                    painter = painterResource(R.drawable.tapioca),
                    contentDescription = "Tapioca",
                    modifier = Modifier.size(250.dp)
                )
                Text("Tapioca", fontSize = 20.sp,modifier = Modifier
                    .padding(top = 25.dp),color = texto,fontWeight = FontWeight.Black)
            }

            8 -> {
                Image(
                    painter = painterResource(R.drawable.temaki),
                    contentDescription = "Temaki",
                    modifier = Modifier.size(250.dp)
                )
                Text("Temaki", fontSize = 20.sp,modifier = Modifier
                    .padding(top = 25.dp),color = texto,fontWeight = FontWeight.Black)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppcomidaTheme {
        App(name = "Teste")
    }
}