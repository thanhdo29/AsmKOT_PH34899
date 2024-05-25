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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailProduct(){
    val rememberScroll= rememberScrollState()
    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScroll).padding(bottom = 20.dp)) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Spacer(modifier = Modifier.weight(1f))
            Box {
                Image(
                    painter = painterResource(id = R.drawable.desk1),
                    contentDescription = "",
                    modifier = Modifier
                        .size(323.dp, 455.dp)
                        .padding(bottom = 25.dp)
                )
            }
        }

        Text(text = "Minimal Stand",
            fontSize = 24 .sp,
            fontWeight = FontWeight(500),
            modifier = Modifier.padding(start = 25.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "$ 50",
                fontSize = 30 .sp,
                fontWeight = FontWeight(700))
            Row(
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

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(top = 10.dp, start = 20.dp)) {
            Image(painter = painterResource(id = R.drawable.star),
                contentDescription = "",
                modifier = Modifier.size(20.dp))
            Text(text = "4.5",
                fontWeight = FontWeight(700),
                fontSize = 18.sp,
                modifier = Modifier.padding(start = 10.dp, end = 20.dp))
            Text(text = "(50 reviews)", fontWeight = FontWeight(600),
                fontSize = 14.sp,
                color = Color(0xFF808080))
        }

        Box(modifier = Modifier.padding(horizontal = 25.dp, vertical = 14.dp)){
            Text(text = "Minimal Stand is made of by natural wood. The design that is very simple and minimal. " +
                    "This is truly one of the best furnitures in any family for now. " +
                    "With 3 different colors, you can easily select the best match for your home.",
                fontSize = 14.sp,
                fontWeight = FontWeight(300),
                color = Color(0xFF606060)
            )
        }

        Row (modifier = Modifier.padding(horizontal = 20.dp)){
            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.height(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF0F0F0))) {
                Image(painter = painterResource(id = R.drawable.marker),
                    contentDescription ="",
                    modifier = Modifier.size(16.dp, 20.dp))
            }

            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp), contentAlignment = Alignment.Center){
                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF242424)),
                    shape = RoundedCornerShape(8 .dp),
                    modifier = Modifier
                        .size(285.dp, 50.dp)
                        .fillMaxWidth(),

                    ) {
                    Text(
                        text = "Add to cart",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600),

                        )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewDetail(){
    DetailProduct()
}