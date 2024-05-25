package com.example.asmkot_ph34899

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Congrats(){
   Column(modifier = Modifier
       .fillMaxSize()
       .background(color = Color.White)) {
       Text(text = "SUCCESS!",
           modifier = Modifier.fillMaxWidth().padding(top = 40.dp),
           fontWeight = FontWeight(700),
           fontSize = 36 .sp,
           textAlign = TextAlign.Center
       )


       Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
           Box(
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(top = 30.dp, bottom = 50.dp),
               contentAlignment = Alignment.Center
           ) {
               Image(
                   painter = painterResource(id = R.drawable.bg_congrat),
                   contentDescription = "",
                   modifier = Modifier.size(268.dp, 230.dp)
               )
               Image(
                   painter = painterResource(id = R.drawable.img_congrat),
                   contentDescription = "",
                   modifier = Modifier.size(200.dp, 180.dp)
               )
           }

           Box(
               modifier = Modifier
                   .size(268.dp, 230.dp),
               contentAlignment = Alignment.BottomCenter
           ) {
               Image(
                   painter = painterResource(id = R.drawable.check),
                   contentDescription = "",
                   modifier = Modifier
                       .size(50.dp, 50.dp)
                       .padding(bottom = 0.dp)
               )
           }
       }



       Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
           Text(text = "Your order will be delivered soon.",
               fontSize = 14.sp,
               fontWeight = FontWeight(400),
               color = Color(0xFF606060)
           )
           Text(text = "Thank you for choosing our app!",
               fontSize = 14.sp,
               fontWeight = FontWeight(400),
               color = Color(0xFF606060),
               modifier = Modifier.padding(top = 5.dp))
       }

       Box(modifier = Modifier
           .fillMaxWidth()
           .padding(top = 40.dp), contentAlignment = Alignment.Center){
           Button(onClick = { /*TODO*/ },
               colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF242424)),
               shape = RoundedCornerShape(8 .dp),
               modifier = Modifier
                   .size(285.dp, 50.dp)
                   .fillMaxWidth(),

               ) {
               Text(
                   text = "Track your orders",
                   fontSize = 18.sp,
                   fontWeight = FontWeight(600),

                   )
           }
       }

       Box(modifier = Modifier
           .fillMaxWidth()
           .padding(top = 25.dp), contentAlignment = Alignment.Center){
           Button(onClick = { /*TODO*/ },
               colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFFFFF)),
               shape = RoundedCornerShape(8.dp),
               border = BorderStroke(1.dp, color = Color(0xFF303030)),
               modifier = Modifier
                   .size(285.dp, 50.dp)
                   .fillMaxWidth(),

               ) {
               Text(
                   text = "BACK TO HOME",
                   fontSize = 18.sp,
                   fontWeight = FontWeight(600),
                    color = Color(0xFF303030)
                   )
           }
       }
   }
}

@Preview(showBackground = true)
@Composable
fun PreviewCongrats(){
    Congrats()
}