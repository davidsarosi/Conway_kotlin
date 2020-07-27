package com.example.demo.main

import com.example.demo.Styles
import javafx.application.Platform
import javafx.geometry.Insets
import javafx.geometry.Pos
import tornadofx.*
import kotlin.system.exitProcess

class OptionsView : View("My View") {

    private val controller: OptionsController by inject()
    override val root = vbox {
        label("Options") {
            addClass(Styles.heading)
            alignment=Pos.CENTER
        }
        vbox {

            this.apply() {

                alignment = Pos.CENTER
                spacing = 10.0
                padding = Insets(10.0, 50.0, 50.0, 50.0)


            }
            with(controller) {
                hbox {
                    button("Ok") {
                        setOnAction {
                            okClicked()
                        }
                    }
                    button("Back") {
                        setOnAction {
                            backClicked()
                        }
                    }
                }
            }
        }
    }
}