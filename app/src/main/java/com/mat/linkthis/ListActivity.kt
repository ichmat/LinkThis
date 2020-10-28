package com.mat.linkthis

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*
import java.time.Instant
import java.util.*

class ListActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val linkImg = getDrawable(R.drawable.link)
        val fileImg = getDrawable(R.drawable.folder)

        val arrayItem: Array<DataExplorer> = arrayOf(
            FileData("Mes dossiers", Date.from(Instant.now()),"Un dossier pour ranger mes liens", fileImg!!),
            LinkData("ChillCoding","https://www.chillcoding.com/blog/2018/01/17/creer-bdd-sqlite-kotlin-android/", Date.from(Instant.now()),"Créer une BDD Sqlite en kotlin", linkImg!!),
            LinkData("Google","https://www.google.fr/", Date.from(Instant.now()),"desc", linkImg),
            LinkData("Lien 3","no link", Date.from(Instant.now()),"desc", linkImg),
            LinkData("Lien 4","no link", Date.from(Instant.now()),"desc", linkImg)
        )

        listItemRecyclerView.layoutManager = LinearLayoutManager(this)
        listItemRecyclerView.adapter = ListDataAdapter(arrayItem)
    }
}