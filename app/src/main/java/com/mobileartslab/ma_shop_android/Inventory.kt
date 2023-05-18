package com.mobileartslab.ma_shop_android

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Inventory(
  @DrawableRes val image: Int,
  @StringRes val category: Int,
  @StringRes val headline: Int,
  @StringRes val subHeadline: Int,
  @StringRes val content: Int
)
