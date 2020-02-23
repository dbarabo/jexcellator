package ru.barabo.jexcellator.param

import ru.barabo.xls.*
import java.awt.Container
import java.util.*

private fun params(): List<Param> {
    val textVar = Var("текс_товое_поле", VarResult(VarType.VARCHAR, "text это"))

    val intVar = Var("числовое_поле", VarResult(VarType.INT, 356))

    val amountVar = Var("поле_суммы", VarResult(VarType.NUMBER, 35.64))

    val checkBoxVar = Var("Check_box_this", VarResult(VarType.INT, 1))

    val datePickerVar = Var("это дата", VarResult(VarType.DATE, Date() ) )

    return listOf(
        Param(ComponentType.TEXTFIELD, textVar),
        Param(ComponentType.TEXTFIELDINT, intVar),
        Param(ComponentType.TEXTFIELDAMOUNT, amountVar),
        Param(ComponentType.CHECKBOX, checkBoxVar),
        Param(ComponentType.DATEPICKER, datePickerVar)
        )
}

fun injectParams(container: Container) {
    buildParams(container, params() )
}