package com.example.demo.main

import com.example.demo.Styles
import javafx.application.Platform
import javafx.beans.property.SimpleIntegerProperty
import javafx.geometry.Insets
import javafx.geometry.Pos
import tornadofx.*
import kotlin.system.exitProcess

class MainView() : View("Hello TornadoFX") {

    private val controller: MainController by inject()
    override val root = vbox {
        text {
            text("Conway's game of life ")
            addClass(Styles.heading)
            fillWidthProperty()
        }


        vbox {

            this.apply() {

                alignment = Pos.BASELINE_CENTER
                spacing = 10.0
                padding = Insets(10.0, 50.0, 50.0, 50.0)




            }
            with(controller) {

                button("Start game") {
                    setOnAction {
                        startGameClicked()
                    }
                }

                button("Options") {
                    setOnAction {
                        optionsClicked()
                    }
                }

                button("Load") {
                    setOnAction {
                        loadClicked()
                    }
                }

                button("Quit") {
                    setOnAction {
                        quitClicked()
                    }
                }

            }
        }
    }


    class MainApp : App(MainView::class, Styles::class) {

        override val primaryView = MainView::class

        init {
            reloadViewsOnFocus()
        }
    }
}
