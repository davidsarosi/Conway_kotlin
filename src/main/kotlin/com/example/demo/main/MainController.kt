package com.example.demo.main

import javafx.application.Platform
import javafx.scene.Scene
import tornadofx.*
import kotlin.system.exitProcess

class MainController : Controller() {

    val mainScreen: MainView by inject()

    fun startGameClicked(){
        println("something")
    }
    fun optionsClicked(){
        println("opt")
        mainScreen.replaceWith(OptionsView::class)

    }

    fun loadClicked(){
        println("load")

    }

    fun quitClicked(){
        Platform.exit();
        exitProcess(0);
    }

}
