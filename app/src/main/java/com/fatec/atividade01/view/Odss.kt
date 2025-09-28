package com.fatec.atividade01.view

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
import androidx.compose.ui.unit.dp
import com.fatec.atividade01.model.Ods

@Composable
fun OdssColumnComponent(
    modifier: Modifier = Modifier
) {
    val odsList = listOf(
        Ods(
            4,
            "Educação de Qualidade",
            "Assegurar a educação inclusiva e equitativa de qualidade, e promover " +
                    "oportunidades de aprendizagem ao longo da vida para todos."
            //   "https://sdgs.un.org/sites/default/files/goals/E_SDG_Icons-04.jpg"
        ),
        Ods(
            10,
            "Redução da Desigualdades",
            "Reduzir a desigualdade dentro dos países e entre eles."
            //    "https://sdgs.un.org/sites/default/files/goals/E_SDG_Icons-10.jpg"
        ),
        Ods(
            17,
            "Parcerias e Meios de Implementação",
            "Fortalecer os meios de implementação e revitalizar a parceria global " +
                    "para o desenvolvimento sustentável."
            //    "https://sdgs.un.org/sites/default/files/goals/E_SDG_Icons-10.jpg"
        ),
    )

    Text(
        text = "ODSs do Sistema",
        style = MaterialTheme.typography.titleLarge,
        modifier = Modifier.padding(6.dp),
        fontWeight = FontWeight.Bold
    )
    LazyColumn(
//    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .padding(6.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        items(odsList) { ods ->
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.LightGray,
                    contentColor = Color.Black
                ),
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(modifier = Modifier.padding(8.dp)) {
//                    AsyncImage(
//                        model = ods.imageUrl,
//                        contentDescription = "ODS ${ods.number}",
//                        modifier = Modifier
//                            .size(64.dp)
//                            .clip(RoundedCornerShape(8.dp)),
//                        contentScale = ContentScale.Crop
//                    )
                    Text(
                        text = "${ods.number} - ${ods.name}",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        text = ods.descryption,
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.DarkGray
                    )
                }
            }
        }
    }
}
