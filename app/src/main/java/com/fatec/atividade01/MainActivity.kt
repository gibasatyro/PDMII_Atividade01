package com.fatec.atividade01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fatec.atividade01.ui.pi.MembersColumnComponent
import com.fatec.atividade01.ui.pi.OdssColumnComponent
import com.fatec.atividade01.ui.pi.ProjectDescriptionComponent
import com.fatec.atividade01.ui.theme.Atividade01Theme

// private var MainActivity.modifier: Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Atividade01Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
//                        modifier = Modifier.fillMaxSize()
                          modifier = Modifier.padding(innerPadding)
                    ) {
                        ProjectDescriptionComponent(
                            modifier = Modifier.weight(0.5f)
                        )

                        Column(
    //                        modifier = Modifier.padding(innerPadding)
                            modifier = Modifier.weight(0.5f)
                        ) {
                            Text(
                                text = "ODS",
                                style = MaterialTheme.typography.titleLarge,
                                modifier = Modifier.padding(8.dp)
                            )
                            OdssColumnComponent(Modifier.weight(1f))

                            Text(
                                text = "Membros",
                                style = MaterialTheme.typography.titleLarge,
                                modifier = Modifier.padding(8.dp)
                            )
                            MembersColumnComponent(Modifier.weight(1f))
                        }
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