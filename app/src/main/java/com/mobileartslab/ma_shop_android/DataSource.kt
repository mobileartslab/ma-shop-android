package com.mobileartslab.ma_shop_android

class DataSource {
  fun loadInventory(): List<Inventory> {
    return listOf<Inventory>(
      Inventory(
        R.drawable.lp1,
        R.string.lp1_category,
        R.string.lp1_headline,
        R.string.lp1_subHeadline,
        R.string.lp1_content
      ),
      Inventory(
        R.drawable.lp2,
        R.string.lp2_category,
        R.string.lp2_headline,
        R.string.lp2_subHeadline,
        R.string.lp2_content
      ),
      Inventory(
        R.drawable.lp3,
        R.string.lp3_category,
        R.string.lp3_headline,
        R.string.lp3_subHeadline,
        R.string.lp3_content
      ),
      Inventory(
        R.drawable.lp4,
        R.string.lp4_category,
        R.string.lp4_headline,
        R.string.lp4_subHeadline,
        R.string.lp4_content
      ),
      Inventory(
        R.drawable.lp5,
        R.string.lp5_category,
        R.string.lp5_headline,
        R.string.lp5_subHeadline,
        R.string.lp5_content
      ),
      Inventory(
        R.drawable.lp6,
        R.string.lp6_category,
        R.string.lp6_headline,
        R.string.lp6_subHeadline,
        R.string.lp6_content
      ),
      Inventory(
        R.drawable.lp7,
        R.string.lp7_category,
        R.string.lp7_headline,
        R.string.lp7_subHeadline,
        R.string.lp7_content
      ),
      Inventory(
        R.drawable.lp8,
        R.string.lp8_category,
        R.string.lp8_headline,
        R.string.lp8_subHeadline,
        R.string.lp8_content
      ),
    )
  }
}