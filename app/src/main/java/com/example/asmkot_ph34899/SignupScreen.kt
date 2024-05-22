package com.example.asmkot_ph34899

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Signup(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 22.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()) {
            LineLeft()
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo",
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .border(
                        BorderStroke(1.dp, color = Color(0xFF303030)),
                        RoundedCornerShape(50.dp)
                    )
                    .padding(horizontal = 14.dp, vertical = 10.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            LineRight()
        }

        Text(text = "WELCOM",
            modifier = Modifier.padding(start = 30.dp, top = 25.dp, bottom = 20.dp),
            fontSize = 24 .sp,
            fontWeight = FontWeight(700)
        )

        Box(
            modifier = Modifier
                .padding(end = 30.dp, top = 10.dp, bottom = 10.dp)
                .shadow(7.dp)
                .background(Color.White)
                .fillMaxSize()
        ) {
            Column {
                EditTextComp(label = "Name")
                EditTextComp(label = "Email")
                EditTextComp(label = "Password")
                EditTextComp(label = "Confirm Password")

                Box(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp), contentAlignment = Alignment.Center){
                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF242424)),
                        shape = RoundedCornerShape(4 .dp),
                        modifier = Modifier
                            .size(285.dp, 50.dp)
                            .fillMaxWidth(),

                        ) {
                        Text(
                            text = "SIGN UP",
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),

                            )
                    }
                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                    horizontalArrangement = Arrangement.Center) {
                    Text(text = "Already have account?",  color = Color(0xFF909090))
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "SIGN IN")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSignup(){
    Signup()
}