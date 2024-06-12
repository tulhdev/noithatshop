package com.example.asmgkotlin.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.asmgkotlin.R

@Composable
fun NotificationScreen(

    ) {

        var text by remember { mutableStateOf("") }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            item {
                TopHeader {
                }
                MaterialTheme()
            }

        }
    }
@Composable
fun TopHeader(onBack: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier
            .width(100.dp)
            .padding(top = 20.dp))
        Text(
            text = "Notification",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,

        )
    }
}
@Composable
fun  MaterialTheme (

){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(2.dp)
    ) {
        NotificationCard(
            imageRes = R.drawable.product_four, // replace with actual drawable resource
            title = "Your order #123456789 has been confirmed",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Turpis pretium et in arcu adipiscing nec.",
            status = "New",
            statusColor = Color.Green
        )
        Spacer(modifier = Modifier.height(16.dp))
        NotificationCard(
            imageRes = R.drawable.product_one, // replace with actual drawable resource
            title = "Your order #123456789 has been canceled",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Turpis pretium et in arcu adipiscing nec.",
            status = "",
            statusColor = Color.Transparent
        )
        Spacer(modifier = Modifier.height(16.dp))
        NotificationCard(
            imageRes = R.drawable.desk, // replace with actual drawable resource
            title = "Discover hot sale furnitures this week.",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Turpis pretium et in arcu adipiscing nec.",
            status = "HOT!",
            statusColor = Color.Red
        )
        Spacer(modifier = Modifier.height(16.dp))
        NotificationCard(
            imageRes = R.drawable.bed_room, // replace with actual drawable resource
            title = "Your order #123456789 has been shipped successfully",
            description = "Please help us to confirm and rate your order to get 10% discount code for next order.",
            status = "",
            statusColor = Color.Transparent
        )
    }
}

@Composable
fun NotificationCard(
    imageRes: Int,
    title: String,
    description: String,
    status: String,
    statusColor: Color
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(Color.White)
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(60.dp)
                .clip(RoundedCornerShape(8.dp))
        )
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = description,
                fontSize = 12.sp
            )
            if (status.isNotEmpty()) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = status,
                    color = statusColor,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
            }
        }
    }
}