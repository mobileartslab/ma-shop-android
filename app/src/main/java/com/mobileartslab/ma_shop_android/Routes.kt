package com.mobileartslab.ma_shop_android

sealed class Routes(val route: String) {
  object SignUp : Routes("SignUp")
  object ForgotPassword : Routes("ForgotPassword")
  object Login : Routes("Login")
  object Dashboard : Routes("Dashboard")
  object Home : Routes("Home")
}