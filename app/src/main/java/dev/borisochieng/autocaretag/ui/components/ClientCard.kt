package dev.borisochieng.autocaretag.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.borisochieng.autocaretag.ui.screens.Client
import dev.borisochieng.autocaretag.ui.theme.AutoCareTheme.colorScheme
import dev.borisochieng.autocaretag.ui.theme.AutoCareTheme.shape
import dev.borisochieng.autocaretag.ui.theme.AutoCareTheme.typography

@Composable
fun ClientCard(
    modifier: Modifier = Modifier,
    client: Client,
    onNavigateToClient: (Client) -> Unit
) {
    Card(
        modifier = modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxWidth()
            .clip(shape.card)
            .clickable(
                onClick = { onNavigateToClient(client) }
            ),
        shape = shape.card,
        colors = CardDefaults.cardColors(Color.Transparent)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(end = 8.dp)
                    .background(
                        color = colorScheme.container,
                        shape = CircleShape
                    )
                    .size(50.dp)
                    .clip(CircleShape)
                    .border(
                        width = 3.dp,
                        color = Color.Transparent,
                        shape = CircleShape
                    )

            ) {
                Text(
                    text = if (client.name != "") "${client.name[0].uppercaseChar()}" else "",
                    modifier = Modifier.align(Alignment.Center)
                )
            }

            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)

            ) {
                Text(
                    modifier = Modifier.padding(vertical = 4.dp),
                    text = client.name,
                    style = typography.bodyLarge
                )
                Row(
                    modifier = Modifier.padding(vertical = 2.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                )
                {
                    Text(
                        modifier = Modifier.padding(vertical = 2.dp),
                        text = client.vehicleName,
                        style = typography.bodyLight,
                        color = colorScheme.primary
                    )
                    Spacer(
                        modifier = Modifier
                            .padding(horizontal = 4.dp, vertical = 2.dp)
                            .size(6.dp)
                            .background(colorScheme.onBackgroundVariant, shape = CircleShape)
                    )

                    Text(
                        modifier = Modifier
                            .padding(vertical = 2.dp)
                            .align(Alignment.CenterVertically)
                            .clickable { onNavigateToClient(client) },
                        text = client.date,
                        style = typography.body,
                        color = Color.Gray
                    )
                }
            }


        }

    }
}

@Preview(showBackground = true)
@Composable
fun RecentActivityCardPreview() {
    val fakeClient = Client(
        id = "1",
        name = "John Doe",
        vehicleName = "Benz E200",
        date = "28-28-2024"
    )
    ClientCard(client = fakeClient, modifier = Modifier, onNavigateToClient = {})


}