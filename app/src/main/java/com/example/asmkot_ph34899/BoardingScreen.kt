package com.example.asmkot_ph34899

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Welcom(navigateLogin:()->Unit){
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.banner),
            contentDescription ="banner",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "MAKE YOUR",
                fontWeight = FontWeight(600),
                color = Color(0xFF606060),
                fontSize = 24 .sp,
                modifier = Modifier.padding(start = 30.dp)
                )
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "HOME BEAUTIFUL",
                fontWeight = FontWeight(700),
                color = Color(0xFF303030),
                fontSize = 30 .sp,
                modifier = Modifier.padding(start = 30.dp)
                )
            Spacer(modifier = Modifier.height(35.dp))
            Text(fontWeight = FontWeight(400),
                fontSize = 18 .sp,
                text = "The best simple place where you",
                modifier = Modifier.padding(start = 59.dp),
                color = Color(0xFF808080,
                    )
            )

            Text(fontWeight = FontWeight(400),
                fontSize = 18 .sp,
                text = "discover most wonderful furnitures",
                modifier = Modifier.padding(start = 59.dp),
                color = Color(0xFF808080,
                )
            )
            Text(fontWeight = FontWeight(400),
                fontSize = 18 .sp,
                text = "and make your home beautiful",
                modifier = Modifier.padding(start = 59.dp),
                color = Color(0xFF808080,
                )
            )

            SpacerComp(height = 154)
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                Button(onClick = { navigateLogin() },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF242424)),
                    shape = RoundedCornerShape(4 .dp),
                    modifier = Modifier.size(159 .dp, 54.dp).fillMaxWidth(),

                    ) {
                    Text(
                        text = "Get Started",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600),

                        )
                }
            }
        }
    }
}

@Composable
fun SpacerComp(height:Int){
    Spacer(modifier = Modifier.padding(top = height.dp))
}

@Preview(showBackground = true)
@Composable
fun WelcomPreview(){
    Welcom(navigateLogin = {})
}