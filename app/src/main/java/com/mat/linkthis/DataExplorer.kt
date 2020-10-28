package com.mat.linkthis

import android.graphics.drawable.Drawable
import java.lang.reflect.Type

interface DataExplorer {
    fun getTitleData() : String
    fun getDescData() : String
    fun getDrawable() : Drawable
}