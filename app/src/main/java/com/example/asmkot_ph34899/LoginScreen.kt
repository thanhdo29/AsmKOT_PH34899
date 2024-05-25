package com.example.asmkot_ph34899

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.*
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Login(doLogin:()->Unit, doSignup:()->Unit){
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

        Text(fontSize = 24 .sp,
            fontWeight = FontWeight(700),
            color = Color(0xFF909090),
            text = "HELLO !",
            lineHeight = 30.sp,
            modifier = Modifier.padding(start = 30.dp, top = 30.dp)
        )

        Text(fontSize = 24 .sp,
            fontWeight = FontWeight(700),
            color = Color(0xFF303030),
            text = "WELCOM BACK",
            lineHeight = 30.sp,
            modifier = Modifier.padding(start = 30.dp, top = 15.dp)
        )

        Box(modifier = Modifier
            .padding(end = 30.dp, top = 25.dp, bottom = 40.dp)
            .shadow(7.dp)
            .background(Color.White)
            .fillMaxSize()) {
            Column {
                EditTextComp(label = "Email")
                EditTextComp(label = "Password")
                Text(text = "Forgot Password",
                    modifier = Modifier.fillMaxWidth().padding(top = 35.dp, bottom = 40.dp),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(600),
                    textAlign = TextAlign.Center,

               )

                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                    Button(onClick = { doLogin() },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF242424)),
                        shape = RoundedCornerShape(4 .dp),
                        modifier = Modifier.size(285 .dp, 50.dp).fillMaxWidth(),

                        ) {
                        Text(
                            text = "Log in",
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),

                            )
                    }
                }

                Text(text = "SIGN UP",
                    modifier = Modifier.fillMaxWidth().padding(top = 30.dp).clickable { doSignup() },
                    fontSize = 15.sp,
                    fontWeight = FontWeight(600),
                    textAlign = TextAlign.Center,

                    )
            }
        }

    }
}

@Composable
fun LineLeft(){
     Spacer(modifier = Modifier
         .height(1.dp)
         .width(105.dp)
         .background(color = Color(0xFFBDBDBD))
         .padding(start = 30.dp, end = 19.dp))

}
@Composable
fun LineRight(){
    Spacer(modifier = Modifier
        .height(1.dp)
        .width(105.dp)
        .background(color = Color(0xFFBDBDBD))
        .padding(start = 19.dp, end = 30.dp))

}

@Composable
fun EditTextComp(label: String) {
    var text by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(top = 27.dp, start = 30.dp)) {
        Text(
            text = label,
            color = Color(0xFF909090),
            fontSize = 14.sp,
            fontWeight = FontWeight(400)
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(35.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                BasicTextField(
                    value = text,
                    onValueChange = { text = it },
                    textStyle = TextStyle(
                        fontSize = 16.sp
                    ),
                    decorationBox = { innerTextField ->

                        innerTextField()
                    },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                if (label=="Password" ||label=="Confirm Password"){
                    IconButton(onClick = { /* TODO */ }) {
                        Image(painter = painterResource(id = R.drawable.icon_pass), contentDescription ="", modifier = Modifier.size(20.dp,20.dp) )
                    }
                }else{

                }
            }
            Divider(
                color = Color(0xFFE0E0E0),
                thickness =1.dp,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .height(1.dp)
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun LoginPreview(){
}