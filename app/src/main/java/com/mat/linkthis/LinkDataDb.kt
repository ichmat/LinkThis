package com.mat.linkthis

import org.jetbrains.anko.db.select

class LinkDataDb(private val dbHelper: LinkDataDbHelper) {

    fun requestLinkData() = dbHelper.use {
        select(Tables.LinkDataTable.NAME,
            Tables.LinkDataTable.TITLE,
            Tables.LinkDataTable.URL,
            Tables.LinkDataTable.DATE,
            Tables.LinkDataTable.DESC
        )
    }
}