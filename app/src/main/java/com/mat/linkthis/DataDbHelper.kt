package com.mat.linkthis

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import org.jetbrains.anko.db.*
import java.net.URL
import java.sql.Date

class LinkDataDbHelper(context: Context) : ManagedSQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {
    companion object{
        val DB_NAME = "datalink.db"
        val DB_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.createTable(
            Tables.LinkDataTable.NAME, true, Tables.LinkDataTable.ID to INTEGER + PRIMARY_KEY,
            Tables.LinkDataTable.TITLE to TEXT,
            Tables.LinkDataTable.URL to TEXT,
            Tables.LinkDataTable.DATE to TEXT,
            Tables.LinkDataTable.DESC to TEXT
        )
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.dropTable(Tables.LinkDataTable.NAME, true)
        onCreate(db)
    }
}