package ru.barabo.jexcellator.db

import ru.barabo.db.DbConnection
import ru.barabo.db.DbSetting
import ru.barabo.db.Query

object XlsQuery : Query(DbConnect)

object DbConnect : DbConnection(
    DbSetting(driver = "org.sqlite.JDBC",
        url = "jdbc:sqlite:babloz.db", user = "", password = "",
        selectCheck = "select 1 from currency where id = 0")
) {

    init {
        checkCreateStructure()
    }

    private fun checkCreateStructure() {

        val session = addSession(false)

        if(!checkBase(session)) {
            throw Exception("db is absent")
        }
        session.isFree = true
    }
}