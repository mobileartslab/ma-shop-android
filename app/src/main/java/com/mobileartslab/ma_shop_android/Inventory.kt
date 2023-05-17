package com.mobileartslab.ma_shop_android

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Inventory(
  @StringRes val stringResourceId: Int,
  @DrawableRes val imageResourceId: Int
)
