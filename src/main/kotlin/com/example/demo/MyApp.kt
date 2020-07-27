package com.example.demo

import com.example.demo.main.MainView
import com.example.demo.main.Table
import javafx.application.Application
import tornadofx.*


class MyApp :App(MainView::class, Styles::class){

    override val primaryView= MainView::class

    init {
        reloadViewsOnFocus()
    }
}
fun main(args: Array<String>) {
   var table=Table(40,40)
   Application.launch(MyApp::class.java, *args)


    table.cells[1][2] = true;
    table.cells[1][1] = true;
    table.cells[1][3] = true;





    table.print()
    println()
    println()
    table.nextgen()
    table.print()
    println()
    println()

    table.nextgen()
    table.print()
    println()
    println()

    table.nextgen()
    table.print()
    println()
    println()

    table.nextgen()
    table.print()
    println()
    println()


    readLine()


}
