package com.fatec.atividade01.ui.pi

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ProjectDescriptionComponent(
    modifier: Modifier = Modifier
) {
    Spacer(modifier = Modifier.height(2.dp))

    Text(
        text = "Sistema TPG-System",
        style = MaterialTheme.typography.titleLarge,
        modifier = Modifier.padding(6.dp),
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )

    Card(
         colors = CardDefaults.cardColors(
            containerColor = Color(0xFF5491c7),
            contentColor = Color(0xFFFFFFFF)
        ),
        modifier = modifier
            .fillMaxWidth()
            .padding(6.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "O *TPG-System* é um sistema com a proposta de implementação de uma Trilha Pedagógica Gamificada com elementos de RPG.\n" +
                       "A ambientação escolhida é a região do Vale do Ribeira no período colonial. \n" +
                       "Em um Universo Alternativo, combinando elementos fantásticos com Mitos e Lendas Nacionais, além de eventos históricos reais, oferecendo uma nova perspectiva de aventura, chamada “Guardiões de Pindorama”.\n" +
                       "A Gameficação é uma ferramenta que possibilita tornar o processo de aprendizagem mais dinâmico, motivador e significativo. Essa abordagem visa engajar os estudantes, desenvolver competências e promover a construção interdisciplinar do conhecimento, em consonância com as diretrizes curriculares nacionais e os princípios de uma educação integral.\n" +
                       "O sistema permite ao professor, o monitoramento personalizado de alunos e turmas, demonstrando a evolução das competências adquiridas e auxiliando na tomada de decisões pedagógicas eficazes..",
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Justify
            )
        }
    }
}