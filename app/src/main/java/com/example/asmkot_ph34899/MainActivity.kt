package com.example.asmkot_ph34899

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.asmkot_ph34899.ui.theme.AsmKOT_PH34899Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AsmKOT_PH34899Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainApp()
                }
            }
        }
    }
}



@Composable
fun MainApp(){

    val navController= rememberNavController()

    androidx.navigation.compose.NavHost(navController = navController, startDestination = "welcom") {
        composable("welcom"){
            Welcom(navigateLogin = {
                navController.navigate("login")
            })
        }
        composable("signup"){
            Signup()
        }
        composable("home"){
            Home(doCart = {navController.navigate("cart")}, doDetail = {navController.navigate("detail")})
        }
        composable("login"){
            Login(doLogin = {
                 navController.navigate("home")
            },
                doSignup = {
                    navController.navigate("signup")
                })
        }
        composable("checkout"){
            Checkout()
        }
        composable("congrat"){
            Congrats()
        }
        composable("cart"){
            Cart()
        }

        composable("detail"){
            DetailProduct()
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AsmKOT_PH34899Theme {
        MainApp()
    }
}