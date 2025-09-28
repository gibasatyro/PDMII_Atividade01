package com.fatec.atividade01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fatec.atividade01.view.MembersColumnComponent
import com.fatec.atividade01.view.OdssColumnComponent
import com.fatec.atividade01.view.ProjectDescriptionComponent
import com.fatec.atividade01.ui.theme.Atividade01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Atividade01Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                          modifier = Modifier.padding(innerPadding)
                    ) {
                        ProjectDescriptionComponent(Modifier.weight(0.56f))
                        OdssColumnComponent(Modifier.weight(0.30f))
                        MembersColumnComponent(Modifier.weight(0.14f))
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Atividade01Theme {
        Greeting("Android")
    }
}