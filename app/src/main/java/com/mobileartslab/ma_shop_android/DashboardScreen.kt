package com.mobileartslab.ma_shop_android

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun DashBoardScreen(navController: NavController) {
    InventoryList(inventoryList = DataSource().loadInventory())
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InventoryCard(inventory: Inventory, modifier: Modifier = Modifier) {
    Card(
      modifier = modifier.padding(12.dp),
      elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {
        Column(Modifier.background(Color.White)) {
            Image(
                painter = painterResource(inventory.image),
                contentDescription = stringResource(inventory.headline),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop,
            )
            Text(
                text = stringResource(inventory.category),
                modifier = Modifier.padding(3.dp),
                color = Color.Gray,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold

            )
            Text(
                text = stringResource(inventory.headline),
                modifier = Modifier.padding(3.dp),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(inventory.subHeadline),
                modifier = Modifier.padding(3.dp),
                color = Color.Gray,
            )
        }
    }
}

@Composable
fun InventoryList(inventoryList: List<Inventory>, modifier: Modifier = Modifier) {
    LazyColumn {
        items(inventoryList) { inventory ->
            InventoryCard(inventory)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DashBoardScreenPreview() {
    DashBoardScreen(navController = rememberNavController())
}