package com.fatec.atividade01.ui.pi

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fatec.atividade01.ui.theme.ComposeIntroTheme

@Composable
fun MembersColumnComponent(
    modifier: Modifier = Modifier
) {  val memberList = listOf(
    Membro("Gilberto Satyro", "gilberto.satyro@fatec.sp.gov.br"),
    Membro("Pedro Xavier", "pedro.xavier@fatec.sp.gov.br"),
    Membro("Raphael Pedretti", "raphael.pedretti@fatec.sp.gov.br"),
    Membro("Renato Valente", "renato.valente@fatec.sp.gov.br"),
)
    LazyColumn {
        items(memberList) { member ->
            Column {
                Text("Membro: ${member.name}")
                Text("eMail: ${member.eMail}")
                Spacer(Modifier.height(9.dp))
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