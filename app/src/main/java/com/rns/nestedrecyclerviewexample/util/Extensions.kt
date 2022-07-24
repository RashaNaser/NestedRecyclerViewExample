package com.rns.nestedrecyclerviewexample.util

import com.rns.nestedrecyclerviewexample.data.MainItem
import com.rns.nestedrecyclerviewexample.data.domain.Podcast
import com.rns.nestedrecyclerviewexample.data.enums.MainItemType

fun Podcast.toMainItem(): MainItem<Any> {
    return MainItem(this, MainItemType.TYPE_PODCAST)
}