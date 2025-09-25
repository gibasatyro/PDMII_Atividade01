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
fun OdssColumnComponent(
    modifier: Modifier = Modifier
) {  val odsList = listOf(
    Ods(7, "Educação de Qualidade"),
    Ods(10, "Redução da Desigualdades"),
    Ods(17, "Parcerias e Meios de Implementação"),
)
    LazyColumn {
        items(odsList) { ods ->
            Column {
                Text("ODS: ${ods.number} - ${ods.descryption}")
                Spacer(Modifier.height(9.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LazyColumnComponentPreview() {
    ComposeIntroTheme    {
        OdssColumnComponent()
    }
}