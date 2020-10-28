package com.mat.linkthis

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import java.util.*

data class FileData(var name : String, val dateCreated : Date, var description : String, var img : Drawable) : AppCompatActivity(), DataExplorer {
    override fun getTitleData(): String = name

    override fun getDescData(): String = description

    override fun getDrawable(): Drawable = img

}