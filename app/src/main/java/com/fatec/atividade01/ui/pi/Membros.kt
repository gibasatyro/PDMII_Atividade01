package com.fatec.atividade01.ui.pi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fatec.atividade01.ui.theme.ComposeIntroTheme

@Composable
fun MembersColumnComponent(
    modifier: Modifier = Modifier
) {
    val memberList = listOf(
        Membro("Gilberto Satyro", "gilberto.satyro@fatec.sp.gov.br"),
        Membro("Pedro Xavier", "pedro.xavier@fatec.sp.gov.br"),
        Membro("Raphael Pedretti", "raphael.pedretti@fatec.sp.gov.br"),
        Membro("Renato Valente", "renato.valente@fatec.sp.gov.br"),
    )

    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
            .padding(6.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        items(memberList) { member ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 3.dp)
            ) {
                Column(modifier = Modifier.padding(8.dp)) {
                    Text(
                        text = member.name,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = member.eMail,
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.Gray
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LazyColumnComponentPreview() {
    ComposeIntroTheme    {
        MembersColumnComponent()
    }
}