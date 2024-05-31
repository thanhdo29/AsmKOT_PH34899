package com.example.asmkot_ph34899

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
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
fun MainApp() {
    val navController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember {
        mutableStateOf(Icons.Default.Home)
    }

    val navBackStackEntry=navController.currentBackStackEntryAsState()
    val currentDestination=navBackStackEntry.value?.destination?.route

    Scaffold(
        bottomBar = {
            androidx.compose.material3.BottomAppBar(
                containerColor = Color.White
            ) {
                if (currentDestination in listOf("home", "favourite", "notification", "profile")){
                    IconButton(onClick = {
                        selected.value = Icons.Default.Home
                        navController.navigate(Screens.Home.screens) {
                            popUpTo("home"){
                                inclusive=false
                            }
                        }
                    }, modifier = Modifier.weight(1f)) {
                        Icon(Icons.Default.Home, contentDescription = null, modifier = Modifier.size(26.dp), tint = if (selected.value == Icons.Default.Home) Color.Black else Color.Gray)
                    }


                    IconButton(onClick = {
                        selected.value = Icons.Default.Favorite
                        navController.navigate(Screens.Favourite.screens) {
                            popUpTo("favourite"){
                                inclusive=false
                            }
                        }
                    }, modifier = Modifier.weight(1f)) {
                        Icon(Icons.Default.Favorite
                            , contentDescription = null, modifier = Modifier.size(26.dp), tint = if (selected.value == Icons.Default.Favorite) Color.Black else Color.Gray)
                    }


                    IconButton(onClick = {
                        selected.value = Icons.Default.Notifications
                        navController.navigate(Screens.Notification.screens) {
                            popUpTo("notification"){
                                inclusive=false
                            }
                        }
                    }, modifier = Modifier.weight(1f)) {
                        Icon(Icons.Default.Notifications, contentDescription = null, modifier = Modifier.size(26.dp), tint = if (selected.value == Icons.Default.Notifications) Color.Black else Color.Gray)
                    }

                    IconButton(onClick = {
                        selected.value = Icons.Default.Person
                        navController.navigate(Screens.Profile.screens) {
                            popUpTo("profile"){
                                inclusive=false
                            }
                        }
                    }, modifier = Modifier.weight(1f)) {
                        Icon(Icons.Default.Person, contentDescription = null, modifier = Modifier.size(26.dp), tint = if (selected.value == Icons.Default.Person) Color.Black else Color.Gray)
                    }
                }
            }
        }
    ) { paddingValues ->
        NavHost(navController = navController, startDestination = "welcom", modifier = Modifier.padding(paddingValues)) {
            composable("welcom") {
                Welcom(navigateLogin = {
                    navController.navigate("login")
                })
            }
            composable("signup") {
                Signup()
            }
            composable("home") {
                Home(doCart = { navController.navigate("cart") }, doDetail = { navController.navigate("detail") })
            }
            composable("login") {
                Login(doLogin = {
                    navController.navigate(Screens.Home.screens)
                },
                    doSignup = {
                        navController.navigate("signup")
                    })
            }
            composable("checkout") {
                Checkout()
            }
            composable("congrat") {
                Congrats()
            }
            composable("cart") {
                Cart()
            }
            composable("detail") {
                DetailProduct()
            }
            composable("favourite"){
                FavouriteScreen()
            }
            composable("notification"){
                NotificationScreen()
            }
            composable("profile"){
                ProfileScreen()
            }
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
