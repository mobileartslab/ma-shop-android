package com.mobileartslab.ma_shop_android

class DataSource {
  fun loadInventory(): List<Inventory> {
    return listOf<Inventory>(
      Inventory(R.string.lp1, R.drawable.lp1),
      Inventory(R.string.lp2, R.drawable.lp2),
      Inventory(R.string.lp3, R.drawable.lp3),
      Inventory(R.string.lp4, R.drawable.lp4),
      Inventory(R.string.lp5, R.drawable.lp5),
      Inventory(R.string.lp6, R.drawable.lp6),
      Inventory(R.string.lp7, R.drawable.lp7),
      Inventory(R.string.lp8, R.drawable.lp8))
  }
}