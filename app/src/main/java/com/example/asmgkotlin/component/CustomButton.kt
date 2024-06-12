package com.example.asmgkotlin.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CustomButton(onClick: () -> Unit, text: String, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF6200EE), // Background color
            contentColor = Color.White // Text color
        ),
        shape = RoundedCornerShape(12.dp), // Rounded corners
        border = BorderStroke(2.dp, Color(0xFFBB86FC)), // Border
        modifier = modifier
            .height(48.dp)
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp)
    ) {
        Text(text)
    }
}
