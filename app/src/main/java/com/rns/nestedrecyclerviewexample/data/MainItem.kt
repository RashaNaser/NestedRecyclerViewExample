package com.rns.nestedrecyclerviewexample.data

import com.rns.nestedrecyclerviewexample.data.enums.MainItemType

data class MainItem<T>(
    var item: T,
    val type: MainItemType
)