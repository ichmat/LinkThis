package com.mat.linkthis

import android.content.Intent
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Build
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import java.lang.reflect.Type
import java.time.LocalDateTime
import java.util.*

data class LinkData (var name : String, val link : String, val dateCreate : Date, var description : String, var img : Drawable) : DataExplorer  {

    override fun getTitleData(): String = name

    override fun getDescData(): String = description

    override fun getDrawable(): Drawable = img
}