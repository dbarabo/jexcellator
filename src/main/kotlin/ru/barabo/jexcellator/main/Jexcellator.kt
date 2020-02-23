package ru.barabo.jexcellator.main

import ru.barabo.jexcellator.param.injectParams
import java.awt.BorderLayout
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import javax.swing.JFrame
import javax.swing.JPanel

object Jexcellator : JFrame() {

    fun start() {
        val mainPanel = JPanel()

        addWindowListener(object : WindowAdapter() {
            override fun windowClosing(e: WindowEvent) {
                System.exit(0)
            }
        })

        contentPane.layout = BorderLayout()
        contentPane.add(mainPanel, BorderLayout.CENTER)
        title = "bal-bla"

        injectParams(mainPanel)

        pack()
        defaultCloseOperation = EXIT_ON_CLOSE
        isVisible = true
       // extendedState = MAXIMIZED_BOTH
    }
}

fun main(args:Array<String>) {

    Jexcellator.start()
}