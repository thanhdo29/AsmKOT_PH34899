package com.example.asmkot_ph34899

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun NotificationScreen(){
    Text(text = "Notification")
}

@Preview(showBackground = true)
@Composable
fun PreviewNotification(){
    NotificationScreen()
}