package com.example.asmkot_ph34899

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Checkout(){
    val rememerScroll= rememberScrollState()
    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememerScroll)) {
        HeaderComp(title = "Check out")
        MethodComp(nameMethod = "Shipping Address")

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .shadow(2.dp, shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp))
                .background(
                    color = Color(0xFFFFFFFF),
                    shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp)
                ),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Bruno Fernandes",
                fontWeight = FontWeight(700),
                fontSize = 18.sp,
                color = Color(0xFF303030),
                modifier = Modifier
                    .padding(vertical = 15.dp)
                    .padding(start = 20.dp)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 2.dp)
                .shadow(2.dp, shape = RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp))
                .background(
                    color = Color(0xFFFFFFFF),
                    shape = RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp)
                ),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "25 rue Robert Latouche, Nice, 06200, Côte D’azur, France",
                fontWeight = FontWeight(400),
                fontSize = 14.sp,
                color = Color(0xFF808080),
                modifier = Modifier
                    .padding(vertical = 15.dp)
                    .padding(start = 20.dp)
            )
        }

        MethodComp(nameMethod = "Payment")

        Row ( modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .shadow(2.dp, shape = RoundedCornerShape(4.dp))
            .background(color = Color(0xFFFFFFFF)),
            verticalAlignment = Alignment.CenterVertically// Adding shadow with 2.dp size and RoundedCornerShape
        ){
            Box(modifier = Modifier.padding(start = 20.dp)){
                Image(painter = painterResource(id = R.drawable.mastercard), contentDescription ="" ,modifier = Modifier.size(32.dp, 25.dp))
            }
            Text(text = "**** **** **** 3947",
                fontSize = 14.sp,
                fontWeight = FontWeight(600),
                modifier = Modifier
                    .padding(start = 15.dp)
                    .padding(vertical = 18.dp))
        }

        MethodComp(nameMethod = "Delivery method")
        Row ( modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .shadow(2.dp, shape = RoundedCornerShape(4.dp))
            .background(color = Color(0xFFFFFFFF)), verticalAlignment = Alignment.CenterVertically// Adding shadow with 2.dp size and RoundedCornerShape
            ){
            Image(painter = painterResource(id = R.drawable.dhl), contentDescription ="" ,
                modifier = Modifier
                    .size(88.dp, 20.dp)
                    .padding(start = 20.dp))
            Text(text = "Fast (2-3days)",
                fontSize = 14.sp,
                fontWeight = FontWeight(600),
                modifier = Modifier
                    .padding(start = 15.dp)
                    .padding(vertical = 18.dp))
        }

        Row( modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .padding(top = 38.dp)
            .shadow(2.dp, shape = RoundedCornerShape(8.dp))
            .background(color = Color(0xFFFFFFFF)), // Adding shadow with 2.dp size and RoundedCornerShape
            horizontalArrangement = Arrangement.SpaceBetween) {
            Column(modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 15.dp)) {
                Text(text = "Order: ",
                    color = Color(0xFF808080),
                    fontSize =  18.sp,
                    fontWeight = FontWeight(400)
                )
                Text(text = "Delivery: ",
                    color = Color(0xFF808080),
                    fontSize =  18.sp,
                    fontWeight = FontWeight(400),
                    modifier = Modifier.padding(vertical = 15.dp))

                Text(text = "Total: ",
                    color = Color(0xFF808080),
                    fontSize =  18.sp,
                    fontWeight = FontWeight(400))
            }

            Column(modifier = Modifier.padding(top = 15.dp, end = 20.dp, bottom = 15.dp)) {
                Text(text = "$ 95.00",
                    color = Color(0xFF242424),
                    fontWeight = FontWeight(600),
                    fontSize = 18.sp
                )

                Text(text = "$ 5.00",
                    color = Color(0xFF242424),
                    fontWeight = FontWeight(600),
                    fontSize = 18.sp,
                    modifier = Modifier.padding(vertical = 15.dp))

                Text(text = "$ 100.00",
                    color = Color(0xFF242424),
                    fontWeight = FontWeight(600),
                    fontSize = 18.sp)
            }


        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 40.dp), contentAlignment = Alignment.Center){
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF242424)),
                shape = RoundedCornerShape(8 .dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),

                ) {
                Text(
                    text = "SUBMIT ORDER",
                    fontSize = 18.sp,
                    fontWeight = FontWeight(600),
                    )
            }
        }
    }

}

@Composable
fun MethodComp(nameMethod:String){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 20.dp)
        .padding(top = 30.dp), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
        Text(text = nameMethod,
            fontWeight = FontWeight(600),
            fontSize = 18.sp,
            color = Color(0xFF909090)
        )
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.Edit, contentDescription = "", tint = Color(0xFF808080))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCheckout(){
    Checkout()
//    MethodComp(nameMethod = "djsd")
}

