package com.example.asmkot_ph34899

sealed class Screens (val screens:String){
    data object Home:Screens("home")
    data object Favourite:Screens("favourite")
    data object Notification:Screens("notification")
    data object Profile:Screens("profile")
}