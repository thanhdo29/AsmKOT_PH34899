package com.example.asmkot_ph34899

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

data class Lamp(val name: String, val price: Double, val img: String)

data class Category(val nameCate:String, val img:Int)

@Composable
fun Home(doCart:()->Unit, doDetail:()->Unit) {
    val lamps = listOf(
        Lamp("Black Simple Lamp", 12.00, "https://m.media-amazon.com/images/I/61Ckk6bdzwL._AC_SL1500_.jpg"),
        Lamp("Black Simple Lamp", 12.00, "https://m.media-amazon.com/images/I/61Ckk6bdzwL._AC_SL1500_.jpg"),
        Lamp("Black Simple Lamp", 12.00, "https://m.media-amazon.com/images/I/61Ckk6bdzwL._AC_SL1500_.jpg"),
        Lamp("Black Simple Lamp", 12.00, "https://m.media-amazon.com/images/I/61Ckk6bdzwL._AC_SL1500_.jpg")
    )

    val cates= listOf(
        Category("Chair",R.drawable.vec ),
        Category("Table",R.drawable.icon_desk ),
        Category("Armchair",R.drawable.icon_chair ),
        Category("Bed",R.drawable.icon_bed )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 5.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "", tint = Color(0xFF808080))
            }
            Spacer(modifier = Modifier.weight(1f))
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Make home",
                    fontSize = 17.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF909090)
                )
                Text(
                    text = "MBEAUTIFUL",
                    fontSize = 17.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF242424)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = { doCart() }) {
                Image(
                    painter = painterResource(id = R.drawable.icon_cart),
                    contentDescription = "icon_search",
                    modifier = Modifier.size(24.dp, 24.dp)
                )
            }
        }

        Box(modifier = Modifier.fillMaxWidth().padding(top = 20.dp)){
            LazyHorizontalGrid(rows = GridCells.Fixed(1), contentPadding = PaddingValues(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.spacedBy(25.dp),
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .height(80.dp)) {
                items(cates){
                        cate->
                    CategoryComp(category = cate)
                }
            }
        }

        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                items(lamps) { lamp ->
                    Type(lamp = lamp, doDetail)
                }
            }
        }
    }
}

@Composable
fun Type(lamp: Lamp, doDetail: () -> Unit) {
    Column {
        Box {
            AsyncImage(
                modifier = Modifier
                    .height(236.dp)
                    .width(157.dp)
                    .clip(RoundedCornerShape(10.dp)),
                model = lamp.img,
                contentDescription = "img_product"
            )
            IconButton(
                onClick = {doDetail() },
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(5.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_cart),
                    contentDescription = "",
                    modifier = Modifier.size(30.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = lamp.name,
            fontSize = 14.sp,
            fontWeight = FontWeight(400),
            color = Color(0xFF606060)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "$ ${lamp.price}",
            fontSize = 14.sp,
            fontWeight = FontWeight(700),
            color = Color(0xFF303030)
        )
    }
}

@Composable
fun CategoryComp(category: Category) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.clip(RoundedCornerShape(12)).background(color = Color(0xFFF5F5F5))
        ) {
            Image(
                painter = painterResource(id = category.img),
                contentDescription = "",
                modifier = Modifier.size(24.dp)
            )
        }
        Text(
            text = category.nameCate,
            color = Color(0xFF999999),
            fontSize = 14.sp,
            fontWeight = FontWeight(400)
        )
    }
}





@Preview(showBackground = true)
@Composable
fun PreviewHome() {
    Home(doCart = {}, doDetail = {})
}
