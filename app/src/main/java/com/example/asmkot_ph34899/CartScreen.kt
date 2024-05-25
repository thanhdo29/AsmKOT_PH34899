package com.example.asmkot_ph34899

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
fun Cart(){
    Column(modifier = Modifier.fillMaxSize()) {
        HeaderComp(title = "My Cart")
        Column(modifier = Modifier.padding(top = 14.dp)) {
            ItemCart()
            ItemCart()
            ItemCart()
        }
        Box(contentAlignment = Alignment.BottomCenter,modifier = Modifier ){
            OutlinedTextField(value = "",
                onValueChange = {},
                trailingIcon = { Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "",
                    modifier = Modifier.background(color = Color(0xFF303030))
                )},
                placeholder = { Text(text = "Enter your promo code", color = Color(0xFF999999))},
                modifier = Modifier.background(color = Color.White)
            )
        }

        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp).padding(top = 20.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Total: ",
                color = Color(0xFF808080),
                fontSize = 20.sp,
                fontWeight = FontWeight(700)
            )
            Text(text = "$ 95.00",
                color = Color(0xFF303030),
                fontSize = 20.sp,
                fontWeight = FontWeight(700))
        }

        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp), contentAlignment = Alignment.Center){
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF242424)),
                shape = RoundedCornerShape(8 .dp),
                modifier = Modifier
                    .fillMaxWidth().padding(horizontal = 20.dp),

                ) {
                Text(
                    text = "Check out",
                    fontSize = 18.sp,
                    fontWeight = FontWeight(600),

                    )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCart(){
    Cart()
}

@Composable
fun HeaderComp(title:String){
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 10.dp), horizontalArrangement = Arrangement.SpaceBetween) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "")
        }
        Text(text = title,
            fontWeight = FontWeight(700),
            fontSize = 16 .sp
        )
        IconButton(onClick = { /*TODO*/ }) {

        }
    }
}

@Composable
fun ItemCart(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)
        .padding(horizontal = 20.dp), horizontalArrangement = Arrangement.SpaceBetween) {
        Image(painter = painterResource(id = R.drawable.img_desk),
            contentDescription ="" ,
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(8.dp)) )
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            Column(verticalArrangement = Arrangement.SpaceBetween) {
                Column {
                    Text(text = "Minimal Stand",
                        modifier = Modifier.padding(bottom = 4.dp),
                        fontWeight = FontWeight(600),
                        fontSize = 14.sp,
                        color = Color(0xFF999999)
                    )
                    Text(text = "$ 25.00",
                        modifier = Modifier.padding(bottom = 4.dp),
                        fontWeight = FontWeight(700),
                        fontSize = 16.sp,
                        color = Color(0xFF242424))
                }
                Row(
                    modifier = Modifier.fillMaxHeight(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .background(color = Color(0xffE0E0E0))
                            .size(30.dp)
                            .clip(RoundedCornerShape(10.dp))
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "",
                            modifier = Modifier.size(14.dp)
                        )
                    }
                    Text(
                        text = "01",
                        modifier = Modifier.padding(horizontal = 10.dp)
                    )
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .background(color = Color(0xffE0E0E0))
                            .size(30.dp)
                            .clip(RoundedCornerShape(10.dp))
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_tru),
                            contentDescription = "",
                            modifier = Modifier.size(9.dp)
                        )
                    }
                }

            }
            IconButton(onClick = { /*TODO*/ },
                modifier = Modifier.size(20.dp)) {
                Image(painter = painterResource(id = R.drawable.icon_cancle),
                    contentDescription ="",
                    modifier = Modifier.size(20.dp) )
            }
        }
    }
    Spacer(modifier = Modifier
        .padding(vertical = 12.dp)
        .height(1.dp)
        .background(color = Color(0xFFF0F0F0))
        .fillMaxWidth())
}