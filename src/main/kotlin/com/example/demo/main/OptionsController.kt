package com.example.demo.main

import javafx.application.Platform
import javafx.scene.Scene
import tornadofx.*
import kotlin.system.exitProcess

class OptionsController : Controller() {

    val optionsScreen: OptionsView by inject()

    fun startGameClicked(){
        println("something")
    }
    fun backClicked(){
        println("back")
        optionsScreen.replaceWith(MainView::class)

    }

    fun okClicked(){
        println("ok")

    }

    fun quitClicked(){
        Platform.exit();
        exitProcess(0);
    }

}
