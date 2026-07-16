package com.example.captiangame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.captiangame.ui.theme.CaptianGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaptianGameTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CaptainGame(modifier = Modifier.padding(innerPadding))
                }

            }

        }
    }
}

@Composable
fun CaptainGame(modifier: Modifier = Modifier) {
    val treasuresFound = remember { mutableStateOf(0) }
    //val treasuresFound by remember {mutableStateOf(0)}
    val direction = remember { mutableStateOf("North")}
    val stormOrTeasures = remember { mutableStateOf("") }

    Column(
        modifier = modifier.fillMaxSize(),
        //verticalArrangement = Arrangement.Center,
        //horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(text = "Treasures Found: ${treasuresFound.value}")
        //Text(text = "Treasures Found: ${treasuresFound}")
        Text(text = "Current Direction: ${direction.value}")
        Text(text = " ${stormOrTeasures.value}")
        Button(onClick = {
            direction.value = "East"
            if(Random.nextBoolean()){
                treasuresFound.value +=1
                //treasuresFound +=1
                stormOrTeasures.value = "Found a Treasure!"
            } else {
                stormOrTeasures.value = "Storm Ahead!"
            }
        }) {
            Text("Sail East")
        }

        Button(onClick = {
            direction.value = "West"
            if(Random.nextBoolean()){
                treasuresFound.value +=1
                //treasuresFound +=1
                stormOrTeasures.value = "Found a Treasure!"
            } else {
                stormOrTeasures.value = "Storm Ahead!"
            }
        }) {
            Text("Sail West")
        }

        Button(onClick = {
            direction.value = "North"
            if(Random.nextBoolean()){
                treasuresFound.value +=1
                //treasuresFound +=1
                stormOrTeasures.value = "Found a Treasure!"
            } else {
                stormOrTeasures.value = "Storm Ahead!"
            }
        }) {
            Text("Sail North")
        }

        Button(onClick = {
            direction.value = "South"
            if(Random.nextBoolean()){
                treasuresFound.value +=1
                stormOrTeasures.value = "Found a Treasure!"
            } else {
                stormOrTeasures.value = "Storm Ahead!"
            }
        }) {
            Text("Sail South")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CapTainGame(){
    CaptainGame()
}

